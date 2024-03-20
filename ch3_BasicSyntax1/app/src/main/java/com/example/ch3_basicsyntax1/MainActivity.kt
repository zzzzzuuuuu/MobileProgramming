package com.example.ch3_basicsyntax1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 부모의 onCreate 실행시키기 위해
        setContentView(R.layout.activity_main) // 내가 추가할

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


        for (index in 1..10) {
            Log.d("For", "현재 숫자는 ${index}")
        }

        var array = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun")
        for (index in 0 until array.size) {
            Log.d("For", "현재 월은 ${array.get(index)}입니다.")
        }

        for (index in 0..10 step 3) {
            Log.d("For", "건너뛰기: ${index}")
        }

        for (index in 10 downTo 0) {
            Log.d("For", "감소시키기: ${index}")
        }

        for (index in 10 downTo 0 step 3) {
            Log.d("For", "건너면서 감소시키기: ${index}")
        }

        for (month in array) {
            Log.d("For", "현재 월은 ${month}입니다.")
        }

        testStringExtension()
    }

    fun testStringExtension() {
        var original : String = "Hello" // String 생략 가능
        var added : String = " Guys~" // String 생략 가능
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
    }
    // String에는 plus라는 메서드가 없으므로 확장해주기
    fun String.plus(word: String) : String {
        return this + word
    }
}