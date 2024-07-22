package com.example.myapplication

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class AjudaFragment : Fragment(R.layout.fragment_ajuda) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ajuda, container, false)

        val fragmentManager = parentFragmentManager

        val imgView = view.findViewById<ImageView>(R.id.imgBackHelp)
        imgView.setOnClickListener {
            fragmentManager.popBackStack()
        }


        return view
    }
}