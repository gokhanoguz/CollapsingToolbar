package com.javatar.collapsingtoolbar.activities;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.javatar.collapsingtoolbar.adapters.DummyDataRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gokhan on 21-Feb-17.
 */

public abstract class BaseToolBarActivity extends AppCompatActivity{

    protected DummyDataRecyclerViewAdapter adapter;

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return (super.onOptionsItemSelected(menuItem));
    }

    protected List<String> createDummyData() {
        List<String> titleList = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            titleList.add("Title " + i );
        }
        return titleList;
    }
}
