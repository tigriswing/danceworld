package com.dream.danceworld.router

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter

//ARouter服务自动注入，所有的对象都是同一个对象，保存在容器中
class DmServiceTest() {
    @JvmField
    @Autowired
    var testService: DmBankPayService? = null

    @JvmField
    @Autowired(name = "/dm/bank")
    var testService1: DmBankPayService? = null

    init {
        ARouter.getInstance().inject(this)
    }

    fun isSame() : Boolean {
        return testService == testService1
    }
}