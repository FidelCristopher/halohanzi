package com.example.chineselearning.audio

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.sin

/**
 * SoundFxManager:
 * Generator efek suara offline untuk latihan (jawaban benar & salah)
 * Menggunakan AudioTrack dengan sintesis nada cerah (chime) & nada keliru (soft thud).
 */
object SoundFxManager {

    private val audioScope = CoroutineScope(Dispatchers.Default)
    private const val SAMPLE_RATE = 44100

    private val correctChimePcm: ByteArray by lazy {
        generateChimePcm()
    }

    private val incorrectBuzzPcm: ByteArray by lazy {
        generateBuzzPcm()
    }

    fun playCorrect() {
        audioScope.launch {
            playRawPcm(correctChimePcm)
        }
    }

    fun playIncorrect() {
        audioScope.launch {
            playRawPcm(incorrectBuzzPcm)
        }
    }

    private fun playRawPcm(pcm: ByteArray) {
        try {
            val track = AudioTrack.Builder()
                .setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .build()
                )
                .setAudioFormat(
                    AudioFormat.Builder()
                        .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                        .setSampleRate(SAMPLE_RATE)
                        .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                        .build()
                )
                .setBufferSizeInBytes(pcm.size)
                .setTransferMode(AudioTrack.MODE_STATIC)
                .build()

            track.write(pcm, 0, pcm.size)
            track.play()

            // Lepaskan resource audio setelah selesai diputar
            val durationMs = (pcm.size / 2 * 1000L) / SAMPLE_RATE + 60
            Thread.sleep(durationMs)
            track.stop()
            track.release()
        } catch (_: Exception) {
            // Ignore error jika audio device sedang sibuk
        }
    }

    /**
     * Menghasilkan nada lonceng cerah (ascending arpeggio C5 - E5 - G5 - C6)
     */
    private fun generateChimePcm(): ByteArray {
        val notes = listOf(523.25, 659.25, 783.99, 1046.50) // C5, E5, G5, C6
        val noteDuration = 0.08 // 80ms per note
        val tailDuration = 0.25 // 250ms tail
        val totalDuration = noteDuration * (notes.size - 1) + tailDuration
        val totalSamples = (SAMPLE_RATE * totalDuration).toInt()
        val buffer = ShortArray(totalSamples)

        for ((idx, freq) in notes.withIndex()) {
            val startSample = (idx * noteDuration * SAMPLE_RATE).toInt()
            val noteLength = if (idx == notes.lastIndex) {
                (tailDuration * SAMPLE_RATE).toInt()
            } else {
                ((noteDuration + 0.1) * SAMPLE_RATE).toInt()
            }

            for (s in 0 until noteLength) {
                val target = startSample + s
                if (target >= totalSamples) break
                val t = s.toDouble() / SAMPLE_RATE
                val wave = sin(2.0 * PI * freq * t) * 0.75 + sin(4.0 * PI * freq * t) * 0.25
                val decay = exp(-7.0 * (s.toDouble() / noteLength))
                val sampleValue = (wave * decay * 18000.0).toInt().coerceIn(-32768, 32767)
                buffer[target] = (buffer[target] + sampleValue / 2).coerceIn(-32768, 32767).toShort()
            }
        }

        val byteBuffer = ByteArray(totalSamples * 2)
        for (i in 0 until totalSamples) {
            val sample = buffer[i].toInt()
            byteBuffer[i * 2] = (sample and 0x00FF).toByte()
            byteBuffer[i * 2 + 1] = ((sample shr 8) and 0x00FF).toByte()
        }
        return byteBuffer
    }

    /**
     * Menghasilkan nada soft thud / gentle buzz yang informatif dan tidak menusuk telinga
     */
    private fun generateBuzzPcm(): ByteArray {
        val duration = 0.22 // 220ms
        val totalSamples = (SAMPLE_RATE * duration).toInt()
        val byteBuffer = ByteArray(totalSamples * 2)
        var phase = 0.0

        for (i in 0 until totalSamples) {
            val progress = i.toDouble() / totalSamples
            // Downward pitch bend dari 200Hz ke 110Hz
            val freq = 200.0 - 90.0 * progress
            phase += 2.0 * PI * freq / SAMPLE_RATE

            // Gelombang lembut dengan sedikit saturasi
            val wave = sin(phase) * 0.8 + sin(phase * 2.0) * 0.2
            val envelope = (1.0 - progress) * (1.0 - progress)
            val sample = (wave * envelope * 15000.0).toInt().coerceIn(-32768, 32767).toShort()

            val intSample = sample.toInt()
            byteBuffer[i * 2] = (intSample and 0x00FF).toByte()
            byteBuffer[i * 2 + 1] = ((intSample shr 8) and 0x00FF).toByte()
        }
        return byteBuffer
    }
}
