package com.example.georgeandizzy

import android.content.Context
import android.media.MediaPlayer

object SoundPlayer {
    fun playSwoosh(context: Context) {
        val popSound = MediaPlayer.create(context, R.raw.swoosh_sound)
        popSound.setOnCompletionListener {
            it.release()
        }

        popSound.start()
    }
}
