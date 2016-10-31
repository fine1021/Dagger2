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

    /**
     * 此处可以不用开放出来，其他组件中没有依赖Application，如果当前组件中需要使用到Application，
     * 可在对应的{@link dagger.Module}类中提供相应的{@link dagger.Provides}方法即可
     *
     * @return Application
     */
    Application getApplication();

    /**
     * 其他的组件中依赖{@link JobExecutor}，此处需要开放出接口供使用
     *
     * @return JobExecutor
     */
    JobExecutor getJobExecutor();

    /**
     * 其他的组件中依赖{@link AnalyticsManager}，此处需要开放出接口供使用
     *
     * @return AnalyticsManager
     */
    AnalyticsManager getAnalyticsManager();
}
