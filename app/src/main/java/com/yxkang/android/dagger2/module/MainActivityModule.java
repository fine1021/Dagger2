package com.yxkang.android.dagger2.module;

import android.app.Activity;

import com.yxkang.android.dagger2.annotation.ActivityScope;
import com.yxkang.android.dagger2.util.DatabaseManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yexiaokang on 2016/10/28.
 */
@Module
public class MainActivityModule {

    private final Activity activity;

    public MainActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    DatabaseManager provideDatabaseManager() {
        return new DatabaseManager(activity);
    }
}
