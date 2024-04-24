package com.example.ch5_fragment1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ch5_fragment1.databinding.FragmentListBinding

class ListFragment : Fragment() {

    var mainActivity : MainActivity? = null

    lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            mainActivity?.goDetail() // null이 아니면 mainActivity의 goDetail()을 불러라
        }

        binding.textTitle.text = arguments?.getString("key1")
        binding.textValue.text = "${arguments?.getInt("key2")}" // string으로 변환
        return binding.root
    }

    override fun onAttach(context: Context) { // onCreateView 보다 먼저 동작함 onAttach -> oncreate -> onCreateView
        super.onAttach(context)
        if (context is MainActivity) mainActivity = context
    }

    fun setValue(value: String) {
        binding.textFromActivity.text = value
    }
}