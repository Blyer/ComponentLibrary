package com.xg.photo;

import com.xg.component.route.BaseApplication;
import com.xg.component.route.BaseApplicationLogic;
import com.xg.component.route.RouteProvider;
import com.xg.component.route.Router;
import com.xg.photo.opencall.PhotoAction;
import com.xg.photo.opencall.PhotoConstants;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class PhotoApplication extends BaseApplicationLogic {

    public PhotoApplication(BaseApplication application) {
        super(application);
    }

    @Override
    public void init() {
        RouteProvider provider = new RouteProvider(PhotoConstants.PHOTO_PROVIDER);
        provider.registerAction(new PhotoAction(PhotoConstants.PHOTO_MAIN_ACTION));
        Router.getInstance().registerProvider(provider);
    }
}
