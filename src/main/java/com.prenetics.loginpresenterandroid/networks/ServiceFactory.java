package com.prenetics.loginpresenterandroid.networks;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServiceFactory {
    static <T> T createServiceFrom(final Class<T> serviceClass, String endpoint) {
        Retrofit adapter = new Retrofit.Builder()
                .baseUrl(endpoint)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return adapter.create(serviceClass);
    }
}
