package com.zenchn.widget.GridEditView;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * 作    者：wangr on 2017/4/25 17:28
 * 描    述：
 * 修订记录：
 */

public class Utils {

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static final float DENSITY = Resources.getSystem().getDisplayMetrics().density;

    /**
     * dp转px，保证尺寸大小不变
     *
     * @param dpValue
     * @return
     */
    public static int dp2px(float dpValue) {
        return Math.round(dpValue * DENSITY);
    }

    /**
     * px转dp，保证尺寸大小不变
     *
     * @param pxValue
     * @return
     */
    public static int px2dp(float pxValue) {
        return Math.round(pxValue / DENSITY);
    }

    /**
     * 获取DisplayMetrics对象
     *
     * @param context
     * @return
     */
    public static DisplayMetrics getDisPlayMetrics(Context context) {
        DisplayMetrics metric = new DisplayMetrics();
        if (null != context) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(metric);
        }
        return metric;
    }

    /**
     * 获取屏幕的宽度（像素）
     *
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context) {
        return getDisPlayMetrics(context).widthPixels;
    }

    /**
     * 获取屏幕的高（像素）
     *
     * @param context
     * @return
     */
    public static int getScreenHeight(Context context) {
        return getDisPlayMetrics(context).heightPixels;
    }

}
