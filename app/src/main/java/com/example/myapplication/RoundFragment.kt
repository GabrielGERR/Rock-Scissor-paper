package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class RoundFragment: Fragment(R.layout.fragment_round) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_round, container, false)
        val fragmentManager = parentFragmentManager

        val imgView = view.findViewById<ImageView>(R.id.img_back)
        imgView.setOnClickListener {
            fragmentManager.popBackStack()
        }
        val button = view.findViewById<Button>(R.id.btn_to_start)
        button.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, GameFragment())
                .addToBackStack(null)
                .commit()
        }


        return view
    }
}