package com.prenetics.loginpresenterandroid.utils;

import android.content.Context;

public class LoginUtils {
    public static void clearLoginData(Context context) {
        PreferenceHelper.onSetPrefBoolSetting(PreferenceHelper.LOGIN_STATUS, false, context);
        PreferenceHelper.onSetPrefStringSetting(PreferenceHelper.ACCOUNT_INFO, "", context);
    }

    public static boolean isLogin(Context context) {
        return PreferenceHelper.onGetPrefBoolSetting(PreferenceHelper.LOGIN_STATUS, false, context);
    }

    public static void saveAccountInfo(Context context,String accountInfo) {
        PreferenceHelper.onSetPrefStringSetting(PreferenceHelper.ACCOUNT_INFO, accountInfo, context);
    }

    public static void changeLoginStatus(Context context, boolean isLogin) {
        PreferenceHelper.onSetPrefBoolSetting(PreferenceHelper.LOGIN_STATUS, isLogin, context);
    }
}
