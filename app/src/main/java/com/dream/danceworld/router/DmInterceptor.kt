package com.dream.danceworld.router;

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

@Interceptor(priority = 8, name = "login")
public class DmInterceptor : IInterceptor {
    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        TODO("Not yet implemented")
        //callback?.onContinue(postcard);
        Log.d("", "test");
        callback?.onInterrupt(null)
    }

    override fun init(context: Context?) {
        TODO("Not yet implemented")
    }
}
