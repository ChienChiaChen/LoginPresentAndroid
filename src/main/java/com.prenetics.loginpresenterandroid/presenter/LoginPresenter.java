package com.prenetics.loginpresenterandroid.presenter;

import com.prenetics.loginpresenterandroid.view.ILoginMvpView;

/**
 * Created by jianjiacheng on 10/2/17.
 */

public class LoginPresenter implements ILoginMvpPresenter {
    private ILoginMvpView mLoginMvpView;

    public LoginPresenter(ILoginMvpView mLoginMvpView) {
        this.mLoginMvpView = mLoginMvpView;
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

    }
}
