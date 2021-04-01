package com.dream.danceworld.router

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.SerializationService
import com.alibaba.android.arouter.launcher.ARouter
import com.dream.danceworld.databinding.ActivityRouterSecendBinding


@Route(path = "/dm/secend")
class SecendActivity : AppCompatActivity() {
    @JvmField
    @Autowired
    var nameva:String = ""
    private lateinit var binding: ActivityRouterSecendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRouterSecendBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ARouter.getInstance().inject(this)
        binding.secendText.setText(nameva)

        val secondService = ARouter.getInstance().build("/dm/bank").navigation()
                as DmBankPayService;
        binding.secendText.setText(secondService.pay(""))

        val  dmServiceTest = DmServiceTest()
        dmServiceTest.isSame()
    }

}