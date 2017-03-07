package com.xg.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xg.component.route.Router;
import com.xg.music.opencall.MusicConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Router.getInstance().route(this, MusicConstants.MUSIC_PROVIDER, MusicConstants.MUSIC_MAIN_ACTION, null);
    }
}
