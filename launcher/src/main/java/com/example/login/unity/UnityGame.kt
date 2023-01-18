package com.example.login.unity

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.plusAssign
import com.example.login.R
import com.example.login.activities.PuzzleActivity
import com.example.login.models.Progress
import com.example.login.service.TrackService
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.unity3d.player.UnityGamePlayer
import com.unity3d.player.UnityPlayer


class UnityGame : UnityGamePlayer() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        mUnityPlayer += MaterialButton(this).apply {
//            layoutParams = FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//            ).apply {
//                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
//            }
//            text = "Change Scene"
//
//            setOnClickListener {
//                UnityPlayer.UnitySendMessage("StartGame", "LoadCustomScene", "DragScene")
//            }
//        }


        mUnityPlayer += ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                100, 100
            ).apply {
                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL or Gravity.END
            }.apply {
                setImageResource(R.drawable.quit)
                setBackgroundResource(R.drawable.quit)
            }.apply {
                marginEnd = 50
            }
            setOnClickListener {
//                stopService(Intent(context, TrackService::class.java))
                postActivityData(Utils.startTime)
                val intent = Intent(context, PuzzleActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT or Intent.FLAG_ACTIVITY_SINGLE_TOP
                }
                startActivity(intent)

//                handler.postDelayed({ startActivity(intent) }, 3000)
//                handler.postDelayed({
//                    unityGamePlayer.finish()
//                }, 3000)
            }
        }
        if (Utils.gameName!!.isEmpty())
            Toast.makeText(this, "Game name not dound", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, Utils.gameName, Toast.LENGTH_LONG).show()


        UnityPlayer.UnitySendMessage("SceneLoader", "LoadCustomScene", Utils.gameName)
    }

    override fun onUnityPlayerUnloaded() {
        Toast.makeText(this, "nUnityPlayerUnloaded", Toast.LENGTH_LONG).show()
        super.onUnityPlayerUnloaded()
    }

    override fun onUnityPlayerQuitted() {
        Toast.makeText(this, "nUnityPlayerUnloaded", Toast.LENGTH_LONG).show()
        super.onUnityPlayerQuitted()
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
}