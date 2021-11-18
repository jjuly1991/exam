package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val cartoonIntentButton: Button = view.findViewById(R.id.intent_button)
        val cartoonLink = Uri.parse("https://www.youtube.com/watch?v=c7Sypr4xGoM")
        val cartoonIntent = Intent(Intent.ACTION_VIEW, cartoonLink)
        cartoonIntentButton.setOnClickListener {
            startActivity(cartoonIntent)

            val musicIntentButton: Button = view.findViewById(R.id.intent_button2)
            val musicLink = Uri.parse("https://www.youtube.com/watch?v=c7Sypr4xGoM")
            val musicIntent = Intent(Intent.ACTION_VIEW, musicLink)
            musicIntentButton.setOnClickListener {

            }

            startActivity(musicIntent)

            val fairyIntentButton: Button = view.findViewById(R.id.intent_button3)
            val fairyLink = Uri.parse("https://www.youtube.com/watch?v=c7Sypr4xGoM")
            val fairyIntent = Intent(Intent.ACTION_VIEW, fairyLink)
            fairyIntentButton.setOnClickListener {
                startActivity(fairyIntent)
            }
        }
        return view
    }
}









