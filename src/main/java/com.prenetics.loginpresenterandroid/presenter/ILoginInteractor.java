package com.prenetics.loginpresenterandroid.presenter;


import com.prenetics.loginpresenterandroid.model.data.request.LoginData;

public interface ILoginInteractor {
    interface OnLoginFinishedListener {
        void onSuccess();
        void onError(int error);
    }

    void attemptLogin(LoginData loginData, OnLoginFinishedListener listener);
}
