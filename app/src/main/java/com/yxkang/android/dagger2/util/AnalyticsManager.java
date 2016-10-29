package com.yxkang.android.dagger2.util;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public class AnalyticsManager {

    private Application application;

    @Inject
    public AnalyticsManager(Application application) {
        this.application = application;
    }
}
