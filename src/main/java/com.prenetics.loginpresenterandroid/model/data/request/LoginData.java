package com.prenetics.loginpresenterandroid.model.data.request;


public class LoginData {
    private String mAccount ;
    private String mPassword;
    private String mUid;
    private String mProduct;

    public LoginData(String account,String password, String uid,String product) {
        mAccount = account;
        mPassword = password;
        mUid = uid;
        mProduct = product;
    }

    private LoginData(Builder builder) {
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

    public static class Builder {
        public LoginData build(){
            return new LoginData(this);
        }
    }
}
