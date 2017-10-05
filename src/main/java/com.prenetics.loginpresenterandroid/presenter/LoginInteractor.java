package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.networks.NetworkWrapper;


public class LoginInteractor implements ILoginInteractor {
    @Override
    public void attemptLogin(LoginData loginData, OnLoginFinishedListener listener) {
        NetworkWrapper.requestLogin(loginData, listener);
    }
}
