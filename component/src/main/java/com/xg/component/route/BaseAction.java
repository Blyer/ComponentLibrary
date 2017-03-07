package com.xg.component.route;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public abstract class BaseAction {

    private String mActionName;

    public BaseAction(String actionName) {
        mActionName = actionName;
    }

    public String getName() {
        return mActionName;
    }

    public abstract void invoke(Context context, HashMap<String, String> data);

}
