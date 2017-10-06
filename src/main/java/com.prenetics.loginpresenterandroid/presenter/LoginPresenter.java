package com.prenetics.loginpresenterandroid.presenter;

import android.util.Log;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.view.ILoginMvpView;

public class LoginPresenter implements ILoginMvpPresenter {
    private ILoginMvpView mLoginMvpView;
    private ILoginInteractor mLoginInteractor;
    private ILoginInteractor.OnLoginFinishedListener onLoginFinishedListener = new ILoginInteractor.OnLoginFinishedListener() {
       @Override
       public void onSuccess() {
           if (null == mLoginMvpView) return;

            mLoginMvpView.navigateToHome();
       }

       @Override
       public void onError(String errorMsg) {
           if (null == mLoginMvpView) return;

           Log.e("Login_Error", "onError " + errorMsg);
           mLoginMvpView.loginFailed();
       }
    };

    public LoginPresenter(ILoginMvpView loginMvpView) {
        mLoginMvpView = loginMvpView;
        mLoginInteractor = new LoginInteractor();
    }

    @Override
    public void login(LoginData loginData) {
        if (null == mLoginMvpView || null == mLoginInteractor) return;

        mLoginMvpView.onLoginStart();
        mLoginInteractor.attemptLogin(loginData, onLoginFinishedListener);
    }

    @Override
    public void onDestroy() {
        mLoginMvpView = null;
    }
}
