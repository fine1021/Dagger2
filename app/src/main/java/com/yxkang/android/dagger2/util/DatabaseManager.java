package com.yxkang.android.dagger2.util;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by yexiaokang on 2016/10/28.
 */

public class DatabaseManager {

    private Context context;

    @Inject
    DatabaseManager(Context context) {
        this.context = context;
    }
}
