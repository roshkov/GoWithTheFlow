package com.example.app_gwtf_last;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.app_gwtf_last.BaseActivity;
import com.example.app_gwtf_last.R;

public class Scoreboard extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_scoreboard);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_scoreboard;
    }

    @Override
    public int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }

}
