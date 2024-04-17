package com.example.ch5_containerrecycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ch5_containerrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val data:MutableList<Memo> = loadData()
        var adapter = CustomAdapter()
        adapter.listData = data

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun loadData(): MutableList<Memo> { //변하는 리스트, 나중에 Memo를 리턴
        var data: MutableList<Memo> = mutableListOf()

        for (no in 1..100) {
            val title = "이것이 코틀린 안드로이드다 ${no}"
            val date = System.currentTimeMillis()
            var memo = Memo(no, title, date)
            data.add(memo)
        }
        return data
    }
}