package com.murat.mvvmwithfirebase.note

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels

import com.murat.mvvmwithfirebase.data.viewmodel.NoteViewModel
import com.murat.mvvmwithfirebase.databinding.FragmentNoteListingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteListingFragment : Fragment() {
    private val viewModel : NoteViewModel by viewModels()
    val TAG :String = "NoteListingFragment"
    lateinit var binding: FragmentNoteListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding =  FragmentNoteListingBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getNote()
        viewModel.note.observe(viewLifecycleOwner){
            it.forEach{ Note ->
                Log.e(TAG, Note.toString() )
            }

        }

    }


}