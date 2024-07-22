package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import kotlin.random.Random

class GameFragment:Fragment(R.layout.fragment_game) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        val button = view.findViewById<Button>(R.id.btn_jogarcarta)
        val img_player01 = view.findViewById<ImageView>(R.id.img_player01)
        val img_player02 = view.findViewById<ImageView>(R.id.img_player02)
        val img_player03 = view.findViewById<ImageView>(R.id.img_player03)

        img_player01.setOnClickListener {
            button.visibility = View.VISIBLE
            img_player01.setBackgroundResource(R.drawable.selecionado)
            img_player02.setBackgroundResource(R.drawable.backgroundimage)
            img_player03.setBackgroundResource(R.drawable.backgroundimage)

            button.setOnClickListener {
                val numeroAleatorio = Random.nextInt(1, 4)
                when (numeroAleatorio) {
                    1 -> {
                        Toast.makeText(requireContext(), "você empatou e perdeu a carta", Toast.LENGTH_SHORT).show()
                    }
                    2 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, LoseFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                    3 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, WinFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                }
            }

        }

        img_player02.setOnClickListener {
            button.visibility = View.VISIBLE
            img_player01.setBackgroundResource(R.drawable.backgroundimage)
            img_player02.setBackgroundResource(R.drawable.selecionado)
            img_player03.setBackgroundResource(R.drawable.backgroundimage)

            button.setOnClickListener {
                val numeroAleatorio = Random.nextInt(1, 4)
                when (numeroAleatorio) {
                    1 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, WinFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                    2 -> {
                        Toast.makeText(requireContext(), "você empatou e perdeu a carta", Toast.LENGTH_SHORT).show()
                    }
                    3 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, LoseFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                }
            }


        }

        img_player03.setOnClickListener {
            button.visibility = View.VISIBLE
            img_player01.setBackgroundResource(R.drawable.backgroundimage)
            img_player02.setBackgroundResource(R.drawable.backgroundimage)
            img_player03.setBackgroundResource(R.drawable.selecionado)

            button.setOnClickListener {
                val numeroAleatorio = Random.nextInt(1, 4)
                when (numeroAleatorio) {
                    1 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, LoseFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                    2 -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fragment, WinFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                    3 -> {
                        Toast.makeText(requireContext(), "você empatou e perdeu a carta", Toast.LENGTH_SHORT).show()
                    }
                }
            }



        }
        return view
    }
}