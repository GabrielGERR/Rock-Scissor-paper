package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeGameFragment: Fragment(R.layout.fragment_home_game) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_game, container,false)

        val button = view.findViewById<Button>(R.id.btn_start)
        button.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, RoundFragment())
                .addToBackStack(null)
                .commit()
        }
        val button2 = view.findViewById<Button>(R.id.btn_help)
        button2.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, AjudaFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}