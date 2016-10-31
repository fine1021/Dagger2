package com.yxkang.android.dagger2.component;

import com.yxkang.android.dagger2.base.ActivityComponent;
import com.yxkang.android.dagger2.ApplicationComponent;
import com.yxkang.android.dagger2.MainActivity;
import com.yxkang.android.dagger2.annotation.ActivityScope;
import com.yxkang.android.dagger2.module.MainActivityModule;

import dagger.Component;

/**
 * Created by yexiaokang on 2016/10/28.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent extends ActivityComponent<MainActivity> {
}
