package com.murat.mvvmwithfirebase.di

import com.google.firebase.firestore.FirebaseFirestore
import com.murat.mvvmwithfirebase.data.repository.NoteRepository
import com.murat.mvvmwithfirebase.data.repository.NoteRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModel {

    @Provides
    @Singleton
    fun provideNoteRepository(
        database : FirebaseFirestore
    ):NoteRepository{
        return NoteRepositoryImp(database)
    }

}