package com.dream.danceworld

import android.net.Uri
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

        val uri = Uri.parse("arouter://m.aliyun.com/dm/secend?nameva=value1")
        binding.jumpSecend.setOnClickListener({
            ARouter.getInstance().build(uri).navigation()
        })
    }
}