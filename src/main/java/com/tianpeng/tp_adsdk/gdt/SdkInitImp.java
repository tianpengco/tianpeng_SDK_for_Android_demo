package com.tianpeng.tp_adsdk.gdt;

import com.tianpeng.tp_adsdk.tpadmobsdk.common.ISdkInit;
import com.tianpeng.tp_adsdk.tpadmobsdk.entity.IADMobGenConfiguration;

/**
 * Created by YuHong on 2019/1/9 0009.
 */
public class SdkInitImp  implements ISdkInit {
    public SdkInitImp() {
    }

    public void init(IADMobGenConfiguration var1) {
        if (var1 != null) {
            ;
        }
    }

    public String getPlatform() {
        return "gdt";
    }
}