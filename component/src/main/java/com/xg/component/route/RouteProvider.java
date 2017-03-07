package com.xg.component.route;

import java.util.ArrayList;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class RouteProvider {
    private String mProviderName;
    private ArrayList<BaseAction> mActions;

    public RouteProvider(String providerName) {
        mProviderName = providerName;
        mActions = new ArrayList<>();
    }

    public String getName() {
        return mProviderName;
    }

    public BaseAction findAction(String actionName) {
        if (actionName == null || "".equals(actionName)) {
            throw new RuntimeException("Action的名字不能为空！！！");
        }
        for (BaseAction action : mActions) {
            if (actionName.equals(action.getName())) {
                return action;
            }
        }
        return null;
    }

    public void registerAction(BaseAction action) {
        if (isActionExist(action)) {
            throw new RuntimeException("注册的Action已存在");
        }
        mActions.add(action);
    }

    private boolean isActionExist(BaseAction action) {
        for (BaseAction temp : mActions) {
            if (temp.getName().equals(action.getName())) {
                return true;
            }
        }
        return false;
    }
}
