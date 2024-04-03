package com.example.ch4_widgetsprogressbar1

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch4_widgetsprogressbar1.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        thread(start=true) {
            Thread.sleep(3000)
            runOnUiThread {
                showProgress(false)
            }
        }
    }

    fun showProgress(show: Boolean) {
//        if (show) {
//            binding.progressBar.visibility = View.VISIBLE
//        } else {
//            binding.progressBar.visibility = View.GONE // 아예 없앰, invisible은 그냥 안 보이게 하는 것 존재는 함
//        }
        binding.progressBar.visibility = if(show) View.VISIBLE else View.GONE
    }
}