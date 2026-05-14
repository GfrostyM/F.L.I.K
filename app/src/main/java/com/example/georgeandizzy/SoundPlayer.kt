package com.example.georgeandizzy

import android.content.Context
import android.media.MediaPlayer

object SoundPlayer {
    fun playFlick(context: Context) {
        val popSound = MediaPlayer.create(context, R.raw.flick_sound)
        popSound.setOnCompletionListener {
            it.release()
        }

        popSound.start()
    }
}
