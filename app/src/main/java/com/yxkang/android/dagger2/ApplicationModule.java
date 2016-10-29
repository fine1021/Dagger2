package com.yxkang.android.dagger2;

import android.app.Application;

import com.yxkang.android.dagger2.util.AnalyticsManager;
import com.yxkang.android.dagger2.util.JobExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yexiaokang on 2016/10/28.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    AnalyticsManager provideAnalyticsManager(Application application) {
        return new AnalyticsManager(application);
    }

    @Provides
    @Singleton
    JobExecutor provideJobExecutor() {
        return new JobExecutor();
    }
}
