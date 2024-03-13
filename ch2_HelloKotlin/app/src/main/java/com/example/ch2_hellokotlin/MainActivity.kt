package com.example.ch2_hellokotlin

import android.os.Bundle // 기본
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity // 기본
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch2_hellokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // 상속 받음
    override fun onCreate(savedInstanceState: Bundle?) { // Bundle로 받았는데 아무런 데이터가 없으면 null로...
        super.onCreate(savedInstanceState) // super -> 부모가 준 .. 거.. 기본으로 한 번 실행시킴
//        enableEdgeToEdge()
         setContentView(R.layout.activity_main) // Resource 클래스

        // 예전
        val text1 : TextView =  findViewById(R.id.textSay)
        val button1 : Button = findViewById(R.id.btnSay)

        // 버튼 눌렀을 때 텍스트가 바뀌도록
        button1.setOnClickListener {
            text1.setText("Hello Kotlin!!!")
        }

        // 현재
//        val binding = ActivityMainBinding.inflate(layoutInflater) // binding을 이용하면 변수 하나만 쓰면 됨
//        setContentView(binding.root)
//
//        binding.btnSay.setOnClickListener {
//            binding.textSay.text = "Hello Kotiln!!!"
//        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}