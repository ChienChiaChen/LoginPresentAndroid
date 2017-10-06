package com.prenetics.loginpresenterandroid.utils;


import android.content.Context;
import android.content.SharedPreferences;

public abstract class PreferenceHelper {
    public static final String TAG_NAME = "ANDROID_SETTING_CONFIG";
    public static final String LOGIN_STATUS = "LOGIN_STATUS";
    public static final String ACCOUNT_INFO = "ACCOUNT_INFO";

    public static boolean onGetPrefBoolSetting(String Tag, Context activityContext) {
        return onGetPrefBoolSetting(Tag, false, activityContext);
    }

    public static boolean onGetPrefBoolSetting(String Tag, boolean defaultValue, Context activityContext) {
        Boolean value;
        if (Tag != null && activityContext != null) {
            SharedPreferences settings = activityContext.getSharedPreferences(TAG_NAME, 0);
            value = settings.getBoolean(Tag, defaultValue);
        } else {
            throw new NullPointerException("Parameter can not be null.");
        }
        return value;
    }

    public static void onSetPrefBoolSetting(String Tag, Boolean Value, Context activityContext) {
        if (Tag != null && Value != null && activityContext != null) {
            SharedPreferences settings = activityContext.getSharedPreferences(TAG_NAME, 0);
            settings.edit().putBoolean(Tag, Value).apply();
        }
    }

    public static void onSetPrefStringSetting(String tag, String value, Context activityContext) {
        if (tag != null && value != null && activityContext != null) {
            SharedPreferences settings = activityContext.getSharedPreferences(TAG_NAME, 0);
            settings.edit().putString(tag, value).apply();
        }
    }

    public static String onGetPrefStringSetting(String tag, Context activityContext) {
        return onGetPrefStringSetting(tag, "", activityContext);
    }

    public static String onGetPrefStringSetting(String tag, String defaultValue, Context activityContext) {
        String value;
        if (tag != null && defaultValue != null && activityContext != null) {
            SharedPreferences settings = activityContext.getSharedPreferences(TAG_NAME, 0);
            value = settings.getString(tag, defaultValue);
        } else {
            throw new NullPointerException("Parameter can not be null.");
        }
        return value;
    }
}
