package com.yxkang.android.dagger2.architecture.main;

import com.yxkang.android.dagger2.util.AnalyticsManager;
import com.yxkang.android.dagger2.util.DatabaseManager;
import com.yxkang.android.dagger2.util.JobExecutor;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import dagger.internal.Preconditions;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public class MainPresenter implements MainContract.Presenter {

    private WeakReference<MainContract.View> reference;
    private JobExecutor jobExecutor;
    private AnalyticsManager analyticsManager;
    private DatabaseManager databaseManager;

    @Inject
    MainPresenter(JobExecutor jobExecutor, AnalyticsManager analyticsManager, DatabaseManager databaseManager) {
        this.jobExecutor = jobExecutor;
        this.analyticsManager = analyticsManager;
        this.databaseManager = databaseManager;
    }

    @Override
    public void onAttachedView(MainContract.View view) {
        reference = new WeakReference<>(view);
    }

    @Override
    public void onDetachedView() {
        reference.clear();
    }

    @Override
    public MainContract.View getView() {
        return Preconditions.checkNotNull(reference.get());
    }
}
