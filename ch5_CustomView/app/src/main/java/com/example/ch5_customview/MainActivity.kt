package com.example.ch5_customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ch5_customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val customView = CustomView(this)

        binding.frameLayout.addView(customView)

    }
}

class CustomView(context: Context) : View(context) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 100f // float 타입이라는 걸 알려줌
        canvas.drawText("안녕하세요", 0f, 100f, paint)

        val blue = Paint()
        blue.style = Paint.Style.FILL
        blue.color = Color.BLUE
        canvas.drawCircle(150f, 300f, 100f, blue) // c: center

        val red = Paint()
        red.style = Paint.Style.STROKE
        red.color = Color.RED
        canvas.drawCircle(400f, 300f, 100f, red)

        val green = Paint()
        green.style = Paint.Style.STROKE
        green.color = Color.GREEN
        val rect = Rect(50, 450, 250, 650)
        canvas.drawRect(rect, green)

        val cyan = Paint()
        cyan.style = Paint.Style.FILL
        cyan.color = Color.CYAN
        val rectf = RectF(300f, 450f, 500f, 650f)
        canvas.drawRoundRect(rectf, 50f, 50f, cyan)
    }
}