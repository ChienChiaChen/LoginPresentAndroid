package com.prenetics.loginpresenterandroid.networks;

public enum  BaseUrl {
    PRODUCTION,DEBUG;

    public String toString() {
        String url = "https://register.prenetics.com";
        switch(this) {
            case PRODUCTION:
                return "https://register.prenetics.com";
            case DEBUG:
                return "https://registerdev.prenetics.com/";
        }
        return url;
    }

}
