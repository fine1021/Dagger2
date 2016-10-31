package com.yxkang.android.dagger2.base;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yxkang.android.dagger2.ApplicationComponent;
import com.yxkang.android.dagger2.application.DaggerApplication;

import javax.inject.Provider;

import dagger.internal.DoubleCheck;

/**
 * Created by fine on 2016/10/29.
 */

public class BaseActivity<T extends ActivityComponent> extends AppCompatActivity {

    private Provider<T> provider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setProvider();
    }

    private void setProvider() {
        provider = DoubleCheck.provider(new Provider<T>() {
            @Override
            public T get() {
                return createActivityComponent();
            }
        });
    }

    protected T createActivityComponent() {
        return null;
    }

    protected Provider<T> getComponentProvider() {
        return provider;
    }

    protected ApplicationComponent getApplicationComponent() {
        Application application = getApplication();
        if (application instanceof DaggerApplication) {
            return ((DaggerApplication) application).getApplicationComponent();
        } else {
            throw new RuntimeException("application class is error");
        }
    }
}
