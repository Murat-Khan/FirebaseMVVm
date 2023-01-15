package com.murat.mvvmwithfirebase.data.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.murat.mvvmwithfirebase.data.model.Note
import com.murat.mvvmwithfirebase.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    val repository: NoteRepository) : ViewModel() {

    val note : MutableLiveData<List<Note>> by lazy {
        MutableLiveData<List<Note>>()
    }

    fun getNote(){
        note.value = repository.getNote()
    }
}