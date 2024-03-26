package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 문제 1번
        var fruits = mutableListOf("Apple", "Banana")
        val afterFruits = fruits.let {
            it.add("Melon")
            it.count()
        }
        Log.d("결과값: ", "${afterFruits}")

        // 문제 3번
//        var nullable: String? = null
//        var size = nullable?.length
//        Log.d("Nullable","문자열의 길이 = $size")


        // 문제 4번
        var nullable : String? = null
        var size = nullable?.length?:43
        Log.d("Nullable","문자열의 길이 = $size")
    }
}