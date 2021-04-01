package com.dream.danceworld.router;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/dm/bank", name = "bank service")
public class DmBankPayServiceImpl implements DmBankPayService{
    @Override
    public String pay(String mount) {
        return "testservice";
    }

    @Override
    public void init(Context context) {

    }
}
