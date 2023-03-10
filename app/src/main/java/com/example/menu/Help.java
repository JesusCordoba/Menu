package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        // Ocultar para ir a la misma pagina que estas
        menu.findItem(R.id.help).setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.play:
                startActivity(new Intent(Help.this,
                        Play.class));
                return true;
            case R.id.score:
                startActivity(new Intent(Help.this,
                        Score.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(Help.this,
                        Settings.class));
                return true;
            case R.id.help:
                startActivity(new Intent(Help.this,
                        Help.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}