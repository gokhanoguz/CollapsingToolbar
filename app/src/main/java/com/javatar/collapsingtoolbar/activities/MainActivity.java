package com.javatar.collapsingtoolbar.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.javatar.collapsingtoolbar.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        Button hideExampleButton = (Button)findViewById(R.id.hide_bar_button);
        Button collapseExampleButton = (Button)findViewById(R.id.collapse_bar_button);

        hideExampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HideBarActivity.class);
                startActivity(intent);
            }
        });
        collapseExampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CollapseBarActivity.class);
                startActivity(intent);
            }
        });
    }

}