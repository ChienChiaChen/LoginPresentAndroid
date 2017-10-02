package com.prenetics.loginpresenterandroid.networks;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LoginService {
    String BASE_URL = "https://register.prenetics.com/v1/";

    @GET("Login")
    Observable<String> onLogin(@Query("account") String account,
                               @Query("pwd") String pwd,
                               @Query("uid") String uid,
                               @Query("product") String product);
}
