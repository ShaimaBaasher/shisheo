// Generated by Dagger (https://dagger.dev).
package com.shisheo.net;

import com.shisheo.net.network.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<Api> apiProvider;

  public Repository_Factory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public Repository get() {
    return newInstance(apiProvider.get());
  }

  public static Repository_Factory create(Provider<Api> apiProvider) {
    return new Repository_Factory(apiProvider);
  }

  public static Repository newInstance(Api api) {
    return new Repository(api);
  }
}