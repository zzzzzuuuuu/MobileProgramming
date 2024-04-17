package com.example.ch5_containerrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ch5_containerrecycleview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class CustomAdapter: RecyclerView.Adapter<Holder>() {
    var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder { // Holder return
        val myBinding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(myBinding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) { // return X
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    override fun getItemCount(): Int { // Int return
        return listData.size
    }
}

class Holder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root) { // view를 줘야함->binding.root

    init {
        binding.root.setOnClickListener{
            Toast.makeText(binding.root.context, "클릭된 아이템 = ${binding.textTitle.text}", Toast.LENGTH_LONG).show()
        }
    }
    fun setMemo(memo: Memo) {
        binding.textNo.text = "${memo.no}" // string으로 바꿔줘야함
        binding.textTitle.text = memo.title

        var sdf = SimpleDateFormat("yyyy/MM/dd")
        var formattedDate = sdf.format(memo.timestamp)
        binding.textDate.text = formattedDate
    }
}