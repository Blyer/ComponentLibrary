package com.xg.component.route;

import android.app.Application;
import android.content.Context;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public abstract class BaseApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        initAppcationLogic();
    }

    public static Context getContext() {
        return sContext;
    }

    public abstract void initAppcationLogic();
}
