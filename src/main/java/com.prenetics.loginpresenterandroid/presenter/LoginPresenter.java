package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.model.ILoginMvpModel;
import com.prenetics.loginpresenterandroid.model.LoginModel;
import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.view.ILoginMvpView;

public class LoginPresenter implements ILoginMvpPresenter {
    private ILoginMvpView mLoginMvpView;
    private ILoginMvpModel mLoginMvpModel;

    public LoginPresenter(ILoginMvpView loginMvpView) {
        mLoginMvpView = loginMvpView;
        mLoginMvpModel = new LoginModel(this);
    }

    @Override
    public void onCreate() {
        mLoginMvpView.findView();
        mLoginMvpView.setListener();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        mLoginMvpView = null;
        mLoginMvpModel = null;
    }

    @Override
    public void onLogin(LoginData loginData) {
        mLoginMvpView.showWaitingCursor();
        mLoginMvpView.clearFocus();
        mLoginMvpModel.requestLogin(loginData);
    }

    @Override
    public void onLoginSuccess() {
        mLoginMvpView.hideWaitingCursor();
    }

    @Override
    public void onLoginFail() {
        mLoginMvpView.hideWaitingCursor();
    }
}
