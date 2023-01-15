package com.murat.mvvmwithfirebase.data.repository

import com.murat.mvvmwithfirebase.data.model.Note

interface NoteRepository {
    fun getNote(): List<Note>
}