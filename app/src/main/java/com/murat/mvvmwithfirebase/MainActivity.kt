package com.murat.mvvmwithfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user :MutableMap<String,Any> = HashMap()
        user["firs"] = "Idris"
        user["last"] = "Mamedov"
        user["born"] = 1986

        FirebaseFirestore.getInstance().collection("user")
            .add(user)
            .addOnSuccessListener { docRef ->
                Log.d("TAG", "DocumentSnapshot added with ID: ${docRef.id}")
            }
            .addOnFailureListener { e ->
                Log.w("TAG", "Error adding document $e " )

            }


    }
}