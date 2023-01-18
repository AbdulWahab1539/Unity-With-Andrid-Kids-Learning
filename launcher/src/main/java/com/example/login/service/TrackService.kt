package com.example.login.service

import android.app.Activity
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import com.example.login.models.Progress
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class TrackService : Service() {

    var startTime: Long = 0

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Log.i("onStartCommand", "onDestroy: ")
        startTime = System.currentTimeMillis()
        return START_STICKY
    }

    override fun onDestroy() {
        Log.i("mytag", "onDestroy: ")
        postActivityData(startTime)
        super.onDestroy()
    }

    private fun postActivityData(startTime: Long) {
        if (Utils.user == null) return
        val endTime = System.currentTimeMillis()
        val timeSpend = endTime - startTime
        val stamp = Utils.getFormattedDateTime().substringBefore(".")
        Toast.makeText(applicationContext, "Postnig to Firebase", Toast.LENGTH_LONG).show()
        val progress = Progress(
            FirebaseAuth.getInstance().currentUser!!.uid,
            stamp,
            FirebaseAuth.getInstance().currentUser!!.email,
            Utils.gameName,
            Utils.getFormattedTime(timeSpend)
        )
        Firebase.database
            .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
            .child("Progress")
            .child(Utils.user!!.guardianId!!)
            .child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child(stamp)
            .setValue(progress)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
