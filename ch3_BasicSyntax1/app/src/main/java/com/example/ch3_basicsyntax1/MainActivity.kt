package com.example.ch3_basicsyntax1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableList = mutableListOf("MON", "TUE", "WED")
        mutableList.add("THU")
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")
        Log.d("Collection", "mutableList의 두 번째 값은 ${mutableList.get(1)}입니다.")

        var stringList = mutableListOf<String>() // 문자열로 된 빈 컬렉션 생성
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        stringList.set(1, "요일 변경")
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")

        stringList.removeAt(1) // 두 번째 값 삭제
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        Log.d("Collection", "stringList에는 ${stringList.size}개의 값이 있습니다.")
    }
}