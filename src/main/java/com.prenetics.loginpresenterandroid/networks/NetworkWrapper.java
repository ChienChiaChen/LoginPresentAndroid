package com.prenetics.loginpresenterandroid.networks;

import android.util.Log;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.presenter.ILoginMvpPresenter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class NetworkWrapper {
    public static void requestLogin(final LoginData loginData, final ILoginMvpPresenter loginMvpPresenter) {
        LoginService loginService = ServiceFactory.createServiceFrom(LoginService.class, LoginService.BASE_URL);
        loginService.onLogin(loginData.getAccount(), loginData.getPassword(), loginData.getUid(), loginData.getProduct())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull String s) {
                        loginMvpPresenter.onLoginSuccess();
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        loginMvpPresenter.onLoginFail();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
