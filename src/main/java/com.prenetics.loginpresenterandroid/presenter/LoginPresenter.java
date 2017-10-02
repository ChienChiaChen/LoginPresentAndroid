package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.model.ILoginMvpModel;
import com.prenetics.loginpresenterandroid.model.LoginModel;
import com.prenetics.loginpresenterandroid.view.ILoginMvpView;

public class LoginPresenter implements ILoginMvpPresenter {
    private ILoginMvpView mLoginMvpView;
    private ILoginMvpModel mLoginMvpModel;

    public LoginPresenter(ILoginMvpView loginMvpView) {
        this.mLoginMvpView = loginMvpView;
        this.mLoginMvpModel = new LoginModel(this);
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
    public void onLogin() {
        mLoginMvpView.showWaitingCursor();
        mLoginMvpView.clearFocus();
        mLoginMvpModel.requestLogin();
    }

    @Override
    public void onLogSuccess() {
        mLoginMvpView.hideWaitingCursor();
    }

    @Override
    public void onLogFail() {
        mLoginMvpView.hideWaitingCursor();

    }
}
