package com.xg.component.route;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class Router {
    private static Router instance = new Router();
    private ArrayList<RouteProvider> mProviders;

    public static Router getInstance() {
        return instance;
    }

    private Router() {
        mProviders = new ArrayList<>();
    }

    public void registerProvider(RouteProvider provider) {
        if (isProviderExist(provider)) {
            throw new RuntimeException("注册的Provider已存在");
        }
        mProviders.add(provider);
    }

    private RouteProvider findProvider(String providerName) {
        for (RouteProvider provider : mProviders) {
            if (provider.getName().equals(providerName)) {
                return provider;
            }
        }
        return null;
    }

    public boolean route(Context context, String providerName, String actionName, HashMap<String, String> data) {
        RouteProvider provider = findProvider(providerName);
        if (provider != null) {
            BaseAction action = provider.findAction(actionName);
            if (action != null) {
                action.invoke(context, data);
                return true;
            }
        }
        return false;
    }

    private boolean isProviderExist(RouteProvider provider) {
        for (RouteProvider temp : mProviders) {
            if (temp.getName().equals(provider.getName())) {
                return true;
            }
        }
        return false;
    }
}
