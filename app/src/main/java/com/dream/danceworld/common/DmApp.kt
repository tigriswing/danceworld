package com.dream.danceworld.common;

import android.app.Application;
import com.alibaba.android.arouter.launcher.ARouter

public class DmApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ARouter.init(this)
    }
}