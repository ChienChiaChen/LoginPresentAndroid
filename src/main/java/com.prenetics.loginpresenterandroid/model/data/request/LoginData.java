package com.prenetics.loginpresenterandroid.model.data.request;


public class LoginData {
    private String mAccount ;
    private String  mPassword;
    private String mUid;
    private String mProduct;

    private LoginData(Builder builder) {
        this.mAccount = builder.account;
        this.mPassword = builder.password;
        this.mUid = builder.uid;
        this.mProduct = builder.product;
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
        private String account;
        private String password;
        private String uid;
        private String product;

        public Builder setAccount(String account) {
            this.account = account;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public LoginData build(){
            return new LoginData(this);
        }
    }
}
