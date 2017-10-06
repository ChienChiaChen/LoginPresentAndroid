package com.prenetics.loginpresenterandroid.presenter;


import com.prenetics.loginpresenterandroid.model.data.request.LoginData;

public interface ILoginInteractor {
    interface OnLoginFinishedListener {
        void onSuccess();
        void onError(String errorMsg);
    }

    void attemptLogin(LoginData loginData, OnLoginFinishedListener listener);
}
