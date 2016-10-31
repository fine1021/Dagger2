package com.yxkang.android.dagger2.application;

import android.app.Application;

import com.yxkang.android.dagger2.ApplicationComponent;
import com.yxkang.android.dagger2.ApplicationModule;
import com.yxkang.android.dagger2.DaggerApplicationComponent;

import javax.inject.Provider;

import dagger.internal.DoubleCheck;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public class DaggerApplication extends Application {

    private Provider<ApplicationComponent> provider;

    @Override
    public void onCreate() {
        super.onCreate();
        setProvider();
    }

    private void setProvider() {
        provider = DoubleCheck.provider(new Provider<ApplicationComponent>() {
            @Override
            public ApplicationComponent get() {
                return createApplicationComponent();
            }
        });
    }

    public ApplicationComponent getApplicationComponent() {
        return provider.get();
    }

    private ApplicationComponent createApplicationComponent() {
        return DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

}
