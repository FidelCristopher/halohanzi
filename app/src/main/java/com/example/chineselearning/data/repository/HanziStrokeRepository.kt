package com.example.chineselearning.data.repository

import android.content.Context
import android.util.JsonReader

data class StrokeStepData(
    val svgPath: String,
    val name: String,
    val description: String
)

data class HanziStrokeData(
    val character: Char,
    val strokes: List<StrokeStepData>
) {
    val totalStrokes: Int get() = strokes.size
}

data class StrokeRule(
    val title: String,
    val hanziRule: String,
    val pinyinRule: String,
    val description: String,
    val exampleHanzi: String,
    val examplePinyin: String,
    val exampleMeaning: String
)

object HanziStrokeRepository {
    private var cachedStrokes: Map<String, List<StrokeStepData>>? = null

    val basicStrokeRules = listOf(
        StrokeRule(
            title = "Atas ke Bawah",
            hanziRule = "从上到下",
            pinyinRule = "cóng shàng dào xià",
            description = "Goresan di bagian atas ditulis terlebih dahulu sebelum bagian bawah.",
            exampleHanzi = "三",
            examplePinyin = "sān",
            exampleMeaning = "tiga"
        ),
        StrokeRule(
            title = "Kiri ke Kanan",
            hanziRule = "从左到右",
            pinyinRule = "cóng zuǒ dào yòu",
            description = "Goresan di sebelah kiri ditulis sebelum bagian sebelah kanan.",
            exampleHanzi = "你",
            examplePinyin = "nǐ",
            exampleMeaning = "kamu"
        ),
        StrokeRule(
            title = "Horizontal sebelum Vertikal",
            hanziRule = "先横后竖",
            pinyinRule = "xiān héng hòu shù",
            description = "Garis mendatar (横) ditarik sebelum garis tegak (竖) yang memotongnya.",
            exampleHanzi = "十",
            examplePinyin = "shí",
            exampleMeaning = "sepuluh"
        ),
        StrokeRule(
            title = "Miring Kiri sebelum Kanan",
            hanziRule = "先撇后捺",
            pinyinRule = "xiān piě hòu nà",
            description = "Garis miring ke kiri (撇) ditulis sebelum miring ke kanan (捺).",
            exampleHanzi = "八",
            examplePinyin = "bā",
            exampleMeaning = "delapan"
        ),
        StrokeRule(
            title = "Luar sebelum Dalam",
            hanziRule = "从外到内",
            pinyinRule = "cóng wài dào nèi",
            description = "Bingkai luar dibuat terlebih dahulu sebelum mengisi komponen di dalamnya.",
            exampleHanzi = "同",
            examplePinyin = "tóng",
            exampleMeaning = "sama / bersama"
        ),
        StrokeRule(
            title = "Masuk Dahulu Baru Tutup",
            hanziRule = "先进后关",
            pinyinRule = "xiān jìn hòu guān",
            description = "Buat bingkai luar, masukkan isi di dalam, lalu tutup garis bawah terakhir.",
            exampleHanzi = "国",
            examplePinyin = "guó",
            exampleMeaning = "negara"
        ),
        StrokeRule(
            title = "Tengah sebelum Kedua Sisi",
            hanziRule = "先中间后两边",
            pinyinRule = "xiān zhōngjiān hòu liǎngbiān",
            description = "Garis vertikal di tengah ditulis lebih dahulu, lalu bagian kiri dan kanan.",
            exampleHanzi = "小",
            examplePinyin = "xiǎo",
            exampleMeaning = "kecil"
        )
    )

    fun getStrokeData(context: Context, character: Char): HanziStrokeData {
        val charStr = character.toString()
        val dataMap = cachedStrokes ?: synchronized(this) {
            cachedStrokes ?: loadStrokes(context).also { cachedStrokes = it }
        }
        val strokes = dataMap[charStr] ?: emptyList()
        return HanziStrokeData(character = character, strokes = strokes)
    }

    private fun loadStrokes(context: Context): Map<String, List<StrokeStepData>> {
        val map = HashMap<String, List<StrokeStepData>>(2000)
        try {
            context.assets.open("hsk/hsk_strokes.json").bufferedReader().use { bufferedReader ->
                val reader = JsonReader(bufferedReader)
                reader.beginObject()
                while (reader.hasNext()) {
                    val key = reader.nextName()
                    reader.beginArray()
                    val strokeList = ArrayList<StrokeStepData>()
                    while (reader.hasNext()) {
                        reader.beginObject()
                        var svg = ""
                        var name = "Goresan"
                        var desc = ""
                        while (reader.hasNext()) {
                            when (reader.nextName()) {
                                "svg" -> svg = reader.nextString()
                                "name" -> name = reader.nextString()
                                "desc" -> desc = reader.nextString()
                                else -> reader.skipValue()
                            }
                        }
                        reader.endObject()
                        strokeList.add(StrokeStepData(svg, name, desc))
                    }
                    reader.endArray()
                    map[key] = strokeList
                }
                reader.endObject()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return map
    }
}
