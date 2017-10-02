package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;

public interface ILoginMvpPresenter extends IBasePresenter {
    void onLogin(LoginData loginData);
    void onLoginSuccess();
    void onLoginFail();
}
