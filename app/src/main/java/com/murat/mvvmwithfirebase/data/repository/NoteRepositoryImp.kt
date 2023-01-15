package com.murat.mvvmwithfirebase.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.murat.mvvmwithfirebase.data.model.Note
import java.util.*

class NoteRepositoryImp(
    val database : FirebaseFirestore
) : NoteRepository{
// we will get data from firebase
    override fun getNote(): List<Note> {
       return arrayListOf(
           Note(
               id =   "ffds",
               tex = "Note 1",
               date =  Date()
           ),
           Note(
               id =   "ffds",
               tex = "Note 2",
               date =  Date()
           ),
           Note(
               id =   "ffds",
               tex = "Note 3",
               date =  Date())
       )
    }
}