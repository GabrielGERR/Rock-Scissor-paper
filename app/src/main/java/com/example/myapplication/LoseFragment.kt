package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class LoseFragment : Fragment(R.layout.fragment_lose) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lose, container, false)
        val img_refresh = view.findViewById<ImageView>(R.id.btn_refresh)
        img_refresh.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, GameFragment())
                .addToBackStack(null)
                .commit()
        }

        val btn_home = view.findViewById<ImageView>(R.id.btn_home)
        btn_home.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, HomeGameFragment())
                .addToBackStack(null)
                .commit()
        }



        return view
    }

}