package com.prenetics.loginpresenterandroid.networks;

import android.support.annotation.NonNull;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.model.data.response.AccountInfo;
import com.prenetics.loginpresenterandroid.presenter.ILoginInteractor;
import com.prenetics.loginpresenterandroid.utils.LoginUtils;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class NetworkWrapper {
    public static void requestLogin(final LoginData loginData, final ILoginInteractor.OnLoginFinishedListener onLoginFinishedListener) {
        LoginService loginService = ServiceFactory.createServiceFrom(LoginService.class, loginData.getBaseUrl().toString());
        loginService.onLogin(loginData.getAccount(), loginData.getPassword(), loginData.getUid(), loginData.getProduct())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<AccountInfo>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull List<AccountInfo> s) {
                        LoginUtils.saveAccountInfo(loginData.getContext(), s.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        LoginUtils.clearLoginData(loginData.getContext());
                        onLoginFinishedListener.onError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        LoginUtils.changeLoginStatus(loginData.getContext(), true);
                        onLoginFinishedListener.onSuccess();
                    }
                });
    }
}
