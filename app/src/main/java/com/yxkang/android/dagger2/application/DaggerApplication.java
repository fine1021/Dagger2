package com.yxkang.android.dagger2.application;

import android.app.Application;

import com.yxkang.android.dagger2.ApplicationComponent;
import com.yxkang.android.dagger2.ApplicationModule;
import com.yxkang.android.dagger2.DaggerApplicationComponent;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public class DaggerApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
