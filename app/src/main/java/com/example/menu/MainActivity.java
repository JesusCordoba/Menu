package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista_menu = (ListView) findViewById(R.id.lista_menu);

        String[] items = { getResources().getString(R.string.menu_play),
                getResources().getString(R.string.menu_scores),
                getResources().getString(R.string.menu_settings),
                getResources().getString(R.string.menu_help) };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,
                R.layout.menu_item, items);

        lista_menu.setAdapter(adapt);

        lista_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View itemClicked, int i, long l) {

                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_play))) {
                // Launch the Game Activity
                    startActivity(new Intent(MainActivity.this,
                            Play.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_help))) {
                // Launch the Help Activity
                    startActivity(new Intent(MainActivity.this,
                            Help.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_settings))) {
                // Launch the Settings Activity
                    startActivity(new Intent(MainActivity.this,
                            Settings.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_scores))) {
                // Launch the Scores Activity
                    startActivity(new Intent(MainActivity.this,
                            Score.class));
                }

            }
        });

    }


}