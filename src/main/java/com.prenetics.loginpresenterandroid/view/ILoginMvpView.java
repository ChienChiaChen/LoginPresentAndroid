package com.prenetics.loginpresenterandroid.view;

public interface ILoginMvpView extends IBaseView {
    void startLogin();
    void endLogin();
    void onLoginSuccess();
    void onLoginFail();
}
