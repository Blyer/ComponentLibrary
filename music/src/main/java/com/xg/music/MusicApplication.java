package com.xg.music;

import com.xg.component.route.BaseApplication;
import com.xg.component.route.BaseApplicationLogic;
import com.xg.component.route.RouteProvider;
import com.xg.component.route.Router;
import com.xg.music.opencall.MusicConstants;
import com.xg.music.opencall.MusicAction;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class MusicApplication extends BaseApplicationLogic {

    public MusicApplication(BaseApplication application) {
        super(application);
    }

    @Override
    public void init() {
        RouteProvider provider = new RouteProvider(MusicConstants.MUSIC_PROVIDER);
        provider.registerAction(new MusicAction(MusicConstants.MUSIC_MAIN_ACTION));
        Router.getInstance().registerProvider(provider);
    }
}
