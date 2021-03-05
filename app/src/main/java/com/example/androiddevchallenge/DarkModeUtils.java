package com.example.androiddevchallenge;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

import androidx.appcompat.app.AppCompatDelegate;

public class DarkModeUtils {

    /*
    * 需要注意的是，当调用setDefaultNightMode()方法并成功切换主题时，应用程序中所有处于started状态的Activity都会被重新创建（不在started状态的Activity则会在恢复started状态时再重新创建，
    * 关于started状态的解释可以参见《第一行代码 第3版》的第13章，Lifecycles部分）。这很好理解，因为Activity不重新创建Activity怎么切换主题呢？
    *
    * 可是如果你当前所处的界面不想被重新创建，比如一个正在播放视频的界面。这个时候可以在Activity的configChanges属性当中配置uiMode来让当前Activity避免被重新创建，如下所示：
    *
    * <activity
    *     android:name=".MainActivity"
    *     android:configChanges="uiMode" />
    * 现在当应用程序的主题发生变化时，MainActivity并不会重新创建，而是会触发onConfigurationChanged()方法的回调，你可以在回调当中手动做一些逻辑处理。
    *
    * override fun onConfigurationChanged(newConfig: Configuration) {
    *     val currentNightMode = newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK
    *     when (currentNightMode) {
    *         Configuration.UI_MODE_NIGHT_NO -> {} // 夜间模式未启用，使用浅色主题
    *         Configuration.UI_MODE_NIGHT_YES -> {} // 夜间模式启用，使用深色主题
    *     }
    * }
    * 如果什么都不做的话，当前的Activity就好像并没有切换主题一样，界面上也不会有任何变化。
    */

    public static final String KEY_CURRENT_MODEL = "night_mode_state_sp";

    private static int getNightModel(Context context) {
        SharedPreferences sp = context.getSharedPreferences(KEY_CURRENT_MODEL, Context.MODE_PRIVATE);
        return sp.getInt(KEY_CURRENT_MODEL, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
    }

    public static void setNightModel(Context context, int nightMode) {
        SharedPreferences sp = context.getSharedPreferences(KEY_CURRENT_MODEL, Context.MODE_PRIVATE);
        sp.edit().putInt(KEY_CURRENT_MODEL, nightMode).apply();
    }

    /**
     * ths method should be called in Application onCreate method
     *
     * @param application application
     */
    public static void init(Application application) {
        int nightMode = getNightModel(application);
        AppCompatDelegate.setDefaultNightMode(nightMode);
    }

    /**
     * 应用夜间模式
     */
    public static void applyNightMode(Context context) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        setNightModel(context, AppCompatDelegate.MODE_NIGHT_YES);
    }

    /**
     * 应用日间模式
     */
    public static void applyDayMode(Context context) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setNightModel(context, AppCompatDelegate.MODE_NIGHT_NO);
    }

    /**
     * 跟随系统主题时需要动态切换
     */
    public static void applySystemMode(Context context) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        setNightModel(context, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
    }

    /**
     * 判断App当前是否处于暗黑模式状态
     *
     * @param context 上下文
     * @return 返回
     */
    public static boolean isDarkMode(Context context) {
        int nightMode = getNightModel(context);
        if (nightMode == AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM) {
            int applicationUiMode = context.getResources().getConfiguration().uiMode;
            int systemMode = applicationUiMode & Configuration.UI_MODE_NIGHT_MASK;
            return systemMode == Configuration.UI_MODE_NIGHT_YES;
        } else {
            return nightMode == AppCompatDelegate.MODE_NIGHT_YES;
        }
    }

}