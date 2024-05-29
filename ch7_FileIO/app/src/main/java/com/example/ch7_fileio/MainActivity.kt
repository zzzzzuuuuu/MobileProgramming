package com.example.ch7_fileio

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch7_fileio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val temp = FileUtil()
//        temp.readTextFile()

        var content1 = ""
        openFileInput("test1.txt").bufferedReader().useLines {
            content1 = it.joinToString("\n")
        }

        // 책에 없지만 시험 범위 포함..
        binding.btnRead.setOnClickListener {
            binding.textView1.text = content1
        }

        var content2 = content1 + "writing text"
        openFileOutput("text2.txt", Context.MODE_PRIVATE).use { stream ->
            stream.write(content2.toByteArray())
        }


//        temp.writeTextFile()

    }
}