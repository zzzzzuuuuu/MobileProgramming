package com.example.ch4_widgetsedittext

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.ch4_widgetsedittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val myBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(myBinding.root)

        myBinding.editText.addTextChangedListener {
            Log.d("EditText", "현재 입력된 값: ${it.toString()}")
        }
    }
}