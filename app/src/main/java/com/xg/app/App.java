package com.xg.app;

import com.xg.component.route.BaseApplication;
import com.xg.music.MusicApplication;
import com.xg.photo.PhotoApplication;

/**
 * Created by YinShengyi on 2017/3/7.
 */
public class App extends BaseApplication {
    @Override
    public void initAppcationLogic() {
        MusicApplication musicApplication = new MusicApplication(this);
        musicApplication.init();
        PhotoApplication photoApplication = new PhotoApplication(this);
        photoApplication.init();
    }
}
