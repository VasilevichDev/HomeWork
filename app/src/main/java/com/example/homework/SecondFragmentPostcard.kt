package com.example.homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController

class SecondFragmentPostcard : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView = view.findViewById<ImageView>(R.id.postcard_image)
        val textView = view.findViewById<TextView>(R.id.postcard_text)

        val extra = FragmentNavigatorExtras(
            Pair(imageView, "postcardImage"),
            Pair(textView, "postcardText")
        )

        view.findViewById<ConstraintLayout>(R.id.postcard_container).setOnClickListener{
            findNavController().navigate(R.id.showDetailsFragment, null, null, extra)
        }
    }

}