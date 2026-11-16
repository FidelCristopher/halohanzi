package com.example.chineselearning.data.repository

import android.content.Context
import org.json.JSONArray

data class HskWordItem(
    val id: Int,
    val hanzi: String,
    val pinyin: String,
    val category: String,
    val meaning: String, // Arti dalam Bahasa Indonesia
    val englishMeaning: String = "" // Arti dalam Bahasa Inggris (referensi)
)

object HskVocabularyRepository {
    private val cache = mutableMapOf<Int, List<HskWordItem>>()

    fun getWordsForLevel(context: Context, level: Int): List<HskWordItem> {
        val safeLevel = level.coerceIn(1, 6)
        return cache.getOrPut(safeLevel) {
            try {
                val filename = "hsk/new_hsk_$safeLevel.json"
                val jsonString = context.assets.open(filename).bufferedReader().use { it.readText() }
                val jsonArray = JSONArray(jsonString)
                val list = ArrayList<HskWordItem>(jsonArray.length())
                for (i in 0 until jsonArray.length()) {
                    val obj = jsonArray.getJSONObject(i)
                    list.add(
                        HskWordItem(
                            id = obj.optInt("id", i + 1),
                            hanzi = obj.optString("hanzi", ""),
                            pinyin = obj.optString("pinyin", ""),
                            category = obj.optString("category", "Kosakata"),
                            meaning = obj.optString("meaning", obj.optString("id_meaning", obj.optString("en", ""))),
                            englishMeaning = obj.optString("en", "")
                        )
                    )
                }
                list
            } catch (e: Exception) {
                emptyList()
            }
        }
    }

    fun getTotalCountForLevel(level: Int): Int {
        return when (level) {
            1 -> 300
            2 -> 200
            3 -> 500
            4 -> 1000
            5 -> 1600
            6 -> 1800
            else -> 300
        }
    }
}
