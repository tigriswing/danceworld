package com.dream.danceworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.dream.danceworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jumpSecend.setOnClickListener(View.OnClickListener {
            ARouter.getInstance().build("/dm/secend").navigation()
        })
    }
}