package com.yuriy.harkusha.udacity_android_nanodegree_project_0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void spotifyButtonClick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void stockHawkButtonClick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void buildIitBiggerButtonClick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void makeYourAppMaterialButtonClick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material App", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void goUbiquitousButtonClick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void capstoneButtonOnclick(View view) {
        toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone App", Toast.LENGTH_SHORT);
        toast.show();
    }
}
