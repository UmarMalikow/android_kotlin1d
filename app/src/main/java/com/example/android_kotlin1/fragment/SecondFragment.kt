package com.example.android_kotlin1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_kotlin1.repository.Repository
import com.example.android_kotlin1.adapter.Adapter
import com.example.android_kotlin1.databinding.FragmentSecondBinding
import com.example.android_kotlin1.model.Model

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

//    private val args by navArgs<SecondFragmentArgs>()
    private val list = mutableListOf<Model>()
    private val adapter = Adapter(list)
    private val repository = Repository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View  {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        getData()
        list.addAll(repository.getListOfCharacters())
        binding.rvRecycler.adapter = adapter

//    }
//
//    private fun getData() {
//        val bundle = arguments
//        if (bundle != null) {
//            val text = bundle.getString("success")
        }
}




//getData()
//    }
//
//    private fun getData() {
//        binding.secTxt.text = args.text