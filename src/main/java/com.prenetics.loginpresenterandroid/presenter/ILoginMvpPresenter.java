package com.prenetics.loginpresenterandroid.presenter;

public interface ILoginMvpPresenter extends IBasePresenter {
    void onLogin();
    void onLogSuccess();
    void onLogFail();
}
