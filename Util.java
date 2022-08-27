package com.ethic.chapter03.utils;

import android.content.Context;

public class Util {

    // 根据手机的分辨率从dp的单位转成px(像素)
    public static int dip2px(Context context, float dpValue){
        // 获取当前手机的像素密度 (1个dp对应几个px)
        float scale = context.getResources().getDisplayMetrics().density;
        // 四舍五入取整
        return (int)(dpValue * scale + 0.5f);
    }
}
