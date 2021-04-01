package com.dream.danceworld.router;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface DmBankPayService extends IProvider {
    String pay(String mount);
}
