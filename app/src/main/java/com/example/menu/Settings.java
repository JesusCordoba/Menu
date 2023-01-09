package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.play:
                startActivity(new Intent(Settings.this,
                        Play.class));
                return true;
            case R.id.score:
                startActivity(new Intent(Settings.this,
                        Score.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(Settings.this,
                        Settings.class));
                return true;
            case R.id.help:
                startActivity(new Intent(Settings.this,
                        Help.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}