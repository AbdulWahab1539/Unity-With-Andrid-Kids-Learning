package com.example.login.utils

import User
import android.app.Activity
import android.media.MediaPlayer
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import com.example.login.R
import com.example.login.models.Progress
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

class Utils {
    companion object {
        var user: User? = null
        var first: Boolean = true
        var music: MediaPlayer? = null
        var gameName: String? = ""
        var startTime: Long = 0
        var length: Int = 0

        fun loadSound(context: Activity, sound: Int, shouldReleased: Boolean) {
            length = 0
            if (music != null) return
            val music = MediaPlayer.create(context, sound)
            music.isLooping = true
            music.start()
            this.music = music
            if (shouldReleased)
                music.release()
        }

        fun releaseMusic() {
            length = 0
            this.music!!.release()
            this.music = null
        }

        fun pauseMusic() {
            if (music == null) return
            music!!.pause()
            length = music!!.currentPosition
        }

        fun resumeMusic() {
            if (music == null) return
            music!!.seekTo(length)
            music!!.start()
            length = 0
        }

        @RequiresApi(Build.VERSION_CODES.O)
        fun getFormattedDateTime(): String {
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
            val formatted = current.format(formatter)
            println("Current Date and Time is: $formatted")
            return formatted
        }

        fun getFormattedTime(millis: Long): String {
            return String.format(
                "%02d Hrs : %02d Min : %02d Sec",
                TimeUnit.MILLISECONDS.toHours(millis),
                TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(
                    TimeUnit.MILLISECONDS.toHours(millis)
                ),
                TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                )
            )
        }

        fun showHide(view: View) {
            view.visibility = if (view.visibility == View.VISIBLE) {
                View.INVISIBLE
            } else {
                View.VISIBLE
            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        fun postActivityData(context: Activity, startTime: Long) {
            if (user == null) return
            val endTime = System.currentTimeMillis()
            val timeSpend = endTime - startTime
            val stamp = getFormattedDateTime().substringBefore(".")

            val progress = Progress(
                FirebaseAuth.getInstance().currentUser!!.uid,
                stamp,
                FirebaseAuth.getInstance().currentUser!!.email,
                context.localClassName,
                getFormattedTime(timeSpend)
            )
            Firebase.database
                .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
                .child("Progress")
                .child(user!!.guardianId!!)
                .child(FirebaseAuth.getInstance().currentUser!!.uid)
                .child(stamp)
                .setValue(progress)
        }


    }
}


