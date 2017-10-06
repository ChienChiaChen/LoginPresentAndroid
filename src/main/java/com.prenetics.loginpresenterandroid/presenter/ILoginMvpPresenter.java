package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;

public interface ILoginMvpPresenter {
    void login(LoginData loginData);
    void onDestroy();
}
