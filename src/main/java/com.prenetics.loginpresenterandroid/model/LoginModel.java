package com.prenetics.loginpresenterandroid.model;



import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.networks.NetworkWrapper;
import com.prenetics.loginpresenterandroid.presenter.ILoginMvpPresenter;

public class LoginModel implements ILoginMvpModel {
    private ILoginMvpPresenter mLoginMvpPresenter;

    public LoginModel(ILoginMvpPresenter loginMvpPresenter) {
        this.mLoginMvpPresenter = loginMvpPresenter;
    }

    @Override
    public void requestLogin(LoginData loginData) {
        NetworkWrapper.requestLogin(loginData, mLoginMvpPresenter);
    }
}
