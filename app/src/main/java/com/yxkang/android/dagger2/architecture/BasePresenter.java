package com.yxkang.android.dagger2.architecture;

/**
 * Created by yexiaokang on 2016/9/29.
 */

public interface BasePresenter<V> {

    void onAttachedView(V view);

    void onDetachedView();

    V getView();
}
