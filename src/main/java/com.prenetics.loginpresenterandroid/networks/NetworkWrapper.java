package com.prenetics.loginpresenterandroid.networks;

import android.util.Log;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;
import com.prenetics.loginpresenterandroid.model.data.response.AccountInfo;
import com.prenetics.loginpresenterandroid.presenter.ILoginMvpPresenter;

import java.util.List;

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
                .subscribe(new Observer<List<AccountInfo>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        TAG("onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull List<AccountInfo> s) {
                        loginMvpPresenter.onLoginSuccess();
                        TAG("onNext");
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        loginMvpPresenter.onLoginFail();
                        TAG("onError");
                    }

                    @Override
                    public void onComplete() {
                        TAG("onComplete");
                    }
                });
    }

    private static void TAG(String tag) {
        Log.e("jason", tag);
    }

}
