package com.example.chineselearning.audio

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import java.util.Locale

class TtsManager(context: Context) {

    private var tts: TextToSpeech? = null
    var isInitialized: Boolean = false
        private set

    private var onSpeechDoneCallback: (() -> Unit)? = null

    init {
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                val result = tts?.setLanguage(Locale.SIMPLIFIED_CHINESE)
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    // Fallback to standard Chinese or default
                    tts?.language = Locale.CHINA
                    Log.w("TtsManager", "SIMPLIFIED_CHINESE missing, using CHINA locale")
                }
                tts?.setSpeechRate(0.85f) // Kecepatan sedikit ramah pembelajar (natural)
                tts?.setPitch(1.0f)
                isInitialized = true

                tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                    override fun onStart(utteranceId: String?) {}

                    override fun onDone(utteranceId: String?) {
                        onSpeechDoneCallback?.invoke()
                    }

                    override fun onError(utteranceId: String?) {
                        onSpeechDoneCallback?.invoke()
                    }
                })
            } else {
                Log.e("TtsManager", "TTS initialization failed: $status")
            }
        }
    }

    fun speak(text: String, speedRate: Float = 0.85f, onDone: (() -> Unit)? = null) {
        if (!isInitialized || tts == null) return
        this.onSpeechDoneCallback = onDone
        tts?.setSpeechRate(speedRate)
        val utteranceId = "utterance_${System.currentTimeMillis()}"
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
    }

    fun stop() {
        tts?.stop()
        onSpeechDoneCallback = null
    }

    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
        tts = null
    }
}
