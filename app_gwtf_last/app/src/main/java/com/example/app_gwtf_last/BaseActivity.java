package com.example.app_gwtf_last;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.app_gwtf_last.R;

public abstract class BaseActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener
{

    BottomNavigationView bottomNavigationView = (BottomNavigationView)
            findViewById(R.id.navigation);

    //<new
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }


    //new>

    private void updateNavigationBarState() {
        int actionId = getNavigationMenuItemId();
        getSelectedItem(bottomNavigationView);
    }


    private int getSelectedItem(BottomNavigationView bottomNavigationView) {
        Menu menu = bottomNavigationView.getMenu();
        for (int i = 0; i < bottomNavigationView.getMenu().size(); i++) {
            MenuItem menuItem = menu.getItem(i);
            if (menuItem.isChecked()) {
                return menuItem.getItemId();
            }
        }
        return 0;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_main:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.navigation_home:
                startActivity(new Intent(this, Scoreboard.class));
                break;
            case R.id.navigation_dashboard:
                startActivity(new Intent(this, MyStats.class));
                break;
        }
        finish();
        return true;
    }

    public abstract int getContentViewId();

    public abstract int getNavigationMenuItemId();
}