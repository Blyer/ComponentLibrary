package com.xg.component.route;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public abstract class BaseApplicationLogic {

    protected BaseApplication mApplication;

    public BaseApplicationLogic(BaseApplication application) {
        mApplication = application;
    }

    public abstract void init();

}
