package io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.activities;

import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import io.github.alexlondon07.tabsandtoolbar_courseudemy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadView();

    }

    private void loadView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
