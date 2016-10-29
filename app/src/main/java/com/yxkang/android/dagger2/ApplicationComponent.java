package com.yxkang.android.dagger2;

import android.app.Application;

import com.yxkang.android.dagger2.util.AnalyticsManager;
import com.yxkang.android.dagger2.util.JobExecutor;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yexiaokang on 2016/10/28.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Application getApplication();

    JobExecutor getJobExecutor();

    AnalyticsManager getAnalyticsManager();
}
