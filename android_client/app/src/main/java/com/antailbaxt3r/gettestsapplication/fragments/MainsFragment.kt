package com.antailbaxt3r.gettestsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_mains.*

import com.antailbaxt3r.gettestsapplication.R

/**
 * A simple [Fragment] subclass.
 */
class MainsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mains, container, false)
    }

}