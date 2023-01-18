package com.example.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.login.models.Progress
import com.example.login.recyclerview.CustomAdapter
import com.example.login.recyclerview.ItemsViewModel
import com.example.login.utils.LoadingScreen
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class GuardianDashboard : AppCompatActivity() {

    lateinit var btnLogout: Button
    lateinit var btnDelete: Button
    private lateinit var recyclerview: RecyclerView
    lateinit var loading: LoadingScreen
//    val progressList = ArrayList<ItemsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guardian_dashboard)

        loading = LoadingScreen
        loading.displayLoadingWithText(this, "Please wait", false)
        btnLogout = findViewById(R.id.btn_logout)
        btnDelete = findViewById(R.id.btn_delete)
        btnLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            Toast.makeText(this, "Logged out Successfully", Toast.LENGTH_SHORT)
                .show()
            startActivity(Intent(applicationContext, LoginActivity::class.java))
            finish()
        }
        btnDelete.setOnClickListener {
            loading.displayLoadingWithText(this, "Please Wait", false)
            Firebase.database
                .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
                .child("Progress")
                .child(FirebaseAuth.getInstance().currentUser!!.uid)
                .removeValue().addOnSuccessListener {
                    loading.hideLoading()
                    getKidsData()
                     }
        }
        recyclerview = findViewById(R.id.rv_details)
        recyclerview.layoutManager = LinearLayoutManager(this)
        getKidsData()
    }

    private fun getKidsData() {
        Log.i("mytag", "getKidsData: ")
        val data = ArrayList<ItemsViewModel>()

        val userListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val children = dataSnapshot.children
                children.forEach { outerLoop ->
                    Log.i("TAG", "GetKidsData: " + outerLoop.value)
                    outerLoop.children.forEach { innerLoop ->
                        val progress = innerLoop.getValue<Progress>()!!
                        data.add(
                            ItemsViewModel(
                                progress.userId!!,
                                progress.stampId!!,
                                progress.email!!, progress.screeName!!,
                                progress.timeSpend!!
                            )
                        )
                    }
                }
                val adapter = CustomAdapter(data)
                recyclerview.adapter = adapter
                loading.hideLoading()
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
            }
        }

        Firebase.database
            .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
            .child("Progress")
            .child(FirebaseAuth.getInstance().currentUser!!.uid)
            .addListenerForSingleValueEvent(userListener)
    }
}