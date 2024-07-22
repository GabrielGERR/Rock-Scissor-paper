package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class WinFragment: Fragment(R.layout.fragment_win) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_win, container, false)

        val img_retry = view.findViewById<ImageView>(R.id.btn_retry)
        img_retry.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, GameFragment())
                .addToBackStack(null)
                .commit()
        }
        val img_done = view.findViewById<ImageView>(R.id.btn_done)
        img_done.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, HomeGameFragment())
                .addToBackStack(null)
                .commit()
        }


        return view
    }
}