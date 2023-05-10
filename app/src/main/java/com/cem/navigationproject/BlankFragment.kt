package com.cem.navigationproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cem.navigationproject.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentBlankBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding metodunda setOnclicker it değeri döndürmediği için findViewById ile tanımladım
        val button=view.findViewById<Button>(R.id.button1)
        val textView=view.findViewById<TextView>(R.id.textView1)

        arguments?.let{
            val userSurname=BlankFragmentArgs.fromBundle(it).userSurname
            textView.text= userSurname
        }
        val action=BlankFragmentDirections.actionBlankFragmentToBlankFragment2()
        button.setOnClickListener {
            Navigation.findNavController(it).navigate(action)

        }
    }
}