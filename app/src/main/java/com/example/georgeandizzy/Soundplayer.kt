package com.example.georgeandizzy

import android.content.Context
import android.media.MediaPlayer

class Soundplayer {
    fun playpop(context: Context) {
        val popsound = MediaPlayer.create(context, R.raw.swoosh_sound)
        popsound.setOnCompletionListener {
            it.release()
        }

        popsound.start()
    }
}