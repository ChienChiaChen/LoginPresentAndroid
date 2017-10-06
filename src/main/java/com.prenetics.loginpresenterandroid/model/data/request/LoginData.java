package com.prenetics.loginpresenterandroid.model.data.request;


import android.content.Context;

import com.prenetics.loginpresenterandroid.networks.BaseUrl;

public class LoginData {
    private Context mContext;
    private String mAccount ;
    private String mPassword;
    private String mUid;
    private String mProduct;
    private BaseUrl mBaseUrl;

    private LoginData(Builder builder) {
        mContext = builder.context;
        mAccount = builder.account;
        mPassword = builder.password;
        mUid = builder.uid;
        mProduct = builder.product;
        mBaseUrl = builder.baseUrl;
    }

    public Context getContext() {
        return mContext;
    }

    public String getAccount() {
        return mAccount;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getUid() {
        return mUid;
    }

    public String getProduct() {
        return mProduct;
    }

    public BaseUrl getBaseUrl() {
        return mBaseUrl;
    }

    public static class Builder {
        private Context context;
        private String account;
        private String password;
        private String uid;
        private String product;
        private BaseUrl baseUrl;

        public Builder(Context context, String account, String password, String uid, String product, BaseUrl baseUrl) {
            this.context = context;
            this.account = account;
            this.password = password;
            this.uid = uid;
            this.product = product;
            this.baseUrl = baseUrl;
        }

        public LoginData build(){
            return new LoginData(this);
        }
    }
}
