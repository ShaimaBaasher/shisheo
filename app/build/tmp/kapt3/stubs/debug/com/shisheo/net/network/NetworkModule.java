package com.shisheo.net.network;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/shisheo/net/network/NetworkModule;", "", "()V", "provideApi", "Lcom/shisheo/net/network/Api;", "retrofit", "Lretrofit2/Retrofit;", "provideApi$app_debug", "provideRetrofitInterface", "provideRetrofitInterface$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.shisheo.net.network.NetworkModule INSTANCE = null;
    
    /**
     * Provides the Post service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the Post service implementation.
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.shisheo.net.network.Api provideApi$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInterface$app_debug() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}