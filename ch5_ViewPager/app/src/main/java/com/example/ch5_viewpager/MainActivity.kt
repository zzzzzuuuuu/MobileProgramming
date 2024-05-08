package com.example.ch5_viewpager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch5_viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myFragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD())

        val myAdapter = FragmentAdapter(this)
        myAdapter.fragmentList = myFragmentList
        binding.viewPager.adapter = myAdapter
    }
}