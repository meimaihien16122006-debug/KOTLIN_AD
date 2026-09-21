package com.example.thltdd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thltdd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            tvHoTen.text = "Họ tên: Đoàn Thị Mai Hiền"
            tvMssv.text = "MSSV: 241505312217"
            tvTuoi.text = "Tuổi: 20"
            tvNganh.text = "Ngành: Công nghệ thông tin"
            tvGpa.text = "GPA: 8.7"
        }
    }
}