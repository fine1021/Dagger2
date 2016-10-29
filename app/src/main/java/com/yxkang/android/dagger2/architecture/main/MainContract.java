package com.yxkang.android.dagger2.architecture.main;

import com.yxkang.android.dagger2.architecture.BasePresenter;
import com.yxkang.android.dagger2.architecture.BaseView;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public interface MainContract {

    interface Presenter extends BasePresenter<View> {

    }

    interface View extends BaseView {

    }
}
