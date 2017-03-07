package com.xg.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xg.component.route.Router;
import com.xg.music.opencall.OtherModuleConstants;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void click(View view) {
        Router.getInstance().route(this, OtherModuleConstants.PHOTO_PROVIDER, OtherModuleConstants.PHOTO_MAIN_ACTION, null);
    }
}
