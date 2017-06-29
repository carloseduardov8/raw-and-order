package com.raw_and_order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user clicks the search button //
    public void searchButtonClick(View view) {
        Intent goToSearch = new Intent(this, SearchActivity.class);
        startActivity(goToSearch);
    }

    public void profileButtonClick(View view) {
        Intent goToProfile = new Intent(this, LoginActivity.class);
        startActivity(goToProfile);
    }

    public void qrButtonClick(View view) {
        Intent goToQR = new Intent(this, QRActivity.class);
        startActivity(goToQR);
    }

    public void configButtonClick(View view) {
        Intent goToConfig = new Intent(this, SettingsActivity.class);
        startActivity(goToConfig);
    }
}