package com.murat.mvvmwithfirebase.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.murat.mvvmwithfirebase.R
import com.murat.mvvmwithfirebase.databinding.FragmentNoteDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteDetailFragment : Fragment() {
    val TAG :String = "NoteDetailFragment"
lateinit var binding: FragmentNoteDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteDetailBinding.inflate(inflater,container,false)
        return binding.root
    }


}