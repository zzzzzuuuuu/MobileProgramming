package com.example.ch7_sharedpreferences

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.preference.PreferenceManager
import com.example.ch7_sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val shared = PreferenceManager.getDefaultSharedPreferences(this)

        val checkBoxValue = shared.getBoolean("key_add_shortcut", false)
        val switchValue = shared.getBoolean("key_switch_on", false)
        val name = shared.getString("key_edit_name", "")
        val selected = shared.getString("key_set_item", "")

        Log.d("Sharedpref", "$checkBoxValue")
        Log.d("Sharedpref", "$switchValue")
        Log.d("Sharedpref", "$name")
        Log.d("Sharedpref", "$selected")

    }
}