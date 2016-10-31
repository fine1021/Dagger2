package com.yxkang.android.dagger2;

import android.content.Context;
import android.os.Bundle;

import com.yxkang.android.dagger2.architecture.main.MainContract;
import com.yxkang.android.dagger2.architecture.main.MainPresenter;
import com.yxkang.android.dagger2.base.BaseActivity;
import com.yxkang.android.dagger2.component.DaggerMainActivityComponent;
import com.yxkang.android.dagger2.component.MainActivityComponent;
import com.yxkang.android.dagger2.module.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainActivityComponent> implements MainContract.View {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getComponentProvider().get().inject(this);
        mainPresenter.onAttachedView(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDetachedView();
        super.onDestroy();
    }

    @Override
    protected MainActivityComponent createActivityComponent() {
        return DaggerMainActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .mainActivityModule(new MainActivityModule(this))
                .build();
    }

}
