package com.xg.music.opencall;

import android.content.Context;
import android.content.Intent;

import com.xg.component.route.BaseAction;
import com.xg.music.MusicActivity;

import java.util.HashMap;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class MusicAction extends BaseAction {
    public MusicAction(String actionName) {
        super(actionName);
    }

    @Override
    public void invoke(Context context, HashMap<String, String> data) {
        Intent intent = new Intent(context, MusicActivity.class);
        context.startActivity(intent);
    }
}
