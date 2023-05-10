package com.cem.navigationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class BlankFragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding metodunda setOnclicker it değeri döndürmediği için findViewById ile tanımladım
        val buton=view.findViewById<Button>(R.id.button2)
        val textView=view.findViewById<TextView>(R.id.textView2)

        arguments?.let{
            val userName=BlankFragment2Args.fromBundle(it).userName
            textView.text=userName
        }
        val action=BlankFragment2Directions.actionBlankFragment2ToBlankFragment()
        buton.setOnClickListener {
            Navigation.findNavController(it).navigate(action)
        }
    }
}