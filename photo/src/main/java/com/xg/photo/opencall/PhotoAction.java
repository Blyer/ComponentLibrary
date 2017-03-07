package com.xg.photo.opencall;

import android.content.Context;
import android.content.Intent;

import com.xg.component.route.BaseAction;
import com.xg.photo.PhotoActivity;

import java.util.HashMap;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class PhotoAction extends BaseAction {
    public PhotoAction(String actionName) {
        super(actionName);
    }

    @Override
    public void invoke(Context context, HashMap<String, String> data) {
        Intent intent = new Intent(context, PhotoActivity.class);
        context.startActivity(intent);
    }
}
