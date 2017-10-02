package com.prenetics.loginpresenterandroid.model;

import com.prenetics.loginpresenterandroid.model.data.request.LoginData;

public interface ILoginMvpModel extends IBaseModel {
    void requestLogin(LoginData loginData);
}
