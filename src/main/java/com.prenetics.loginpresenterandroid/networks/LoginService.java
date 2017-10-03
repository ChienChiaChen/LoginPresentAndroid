package com.prenetics.loginpresenterandroid.networks;

import com.prenetics.loginpresenterandroid.model.data.response.AccountInfo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LoginService {
    String BASE_URL = "https://register.prenetics.com/";

    @GET("v1/Login")
    Observable<List<AccountInfo>> onLogin(@Query("account") String account,
                                          @Query("pwd") String pwd,
                                          @Query("uid") String uid,
                                          @Query("product") String product);
}
