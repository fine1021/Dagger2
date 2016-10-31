package com.yxkang.android.dagger2.base;

import android.app.Activity;

/**
 * Created by yexiaokang on 2016/10/31.
 */

public interface ActivityComponent<T extends Activity> {

    void inject(T activity);
}
