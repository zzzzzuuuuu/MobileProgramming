package com.example.ch6_permission

import android.Manifest
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.ch6_permission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var activityResult: ActivityResultLauncher<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 초기화 및 등록
        activityResult = registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted -> // it 대신 씀, it 쓰면 생략가능
            if (isGranted) {
                startProcess()
            } else {
                finish()
            }
        }

        // 등록된 거 동작시키기
        binding.btnCamera.setOnClickListener {
            activityResult.launch(Manifest.permission.CAMERA)
        }
    }
    fun startProcess() {
       Toast.makeText(this, "카메라를 실행합니다", Toast.LENGTH_SHORT).show()
    }
}