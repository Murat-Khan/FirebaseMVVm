package com.murat.mvvmwithfirebase.data.model


import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Note (
 var id: String,
 var tex : String,
 @ServerTimestamp
 var date: Date
        )