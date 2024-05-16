package com.example.ch5_customtext

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomText: AppCompatTextView { // 상속받음. 호환성 처리

    fun process(delimeter: String) {
        var one = text.substring(0, 4) // 연도
        var two = text.substring(4, 6) // 월
        var three = text.substring(6) // 일, 6부터 다 가져옴

        setText("$one $delimeter $two $delimeter $three")
    }
    constructor(context: Context): super(context){}
    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        val typed = context.obtainStyledAttributes(attrs, R.styleable.CustomText)
        val size = typed.indexCount

        for (i in 0 until size) {
            when (typed.getIndex(i)) {
                R.styleable.CustomText_delimeter -> {
                    val delimeter = typed.getString(typed.getIndex(i)) ?: "-"
                    process(delimeter)
                }
            }
        }
    }
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr){}

}