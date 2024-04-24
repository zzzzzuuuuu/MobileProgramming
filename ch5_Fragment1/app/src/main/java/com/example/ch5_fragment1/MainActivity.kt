package com.example.ch5_fragment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setFragmemt()
    }

    fun setFragmemt() {
        val listFragment = ListFragment() // 이 때 생성됨
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, listFragment)
        transaction.commit()
    }

    fun goDetail() {
        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }

    fun goBack() {
        onBackPressed()
    }
}