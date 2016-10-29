package com.yxkang.android.dagger2.base;

import android.support.v7.app.AppCompatActivity;

import com.yxkang.android.dagger2.ApplicationComponent;
import com.yxkang.android.dagger2.application.DaggerApplication;

/**
 * Created by fine on 2016/10/29.
 */

public class BaseActivity extends AppCompatActivity {

    protected ApplicationComponent getApplicationComponent() {
        return ((DaggerApplication) getApplication()).getApplicationComponent();
    }
}
