package com.raw_and_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String restaurantName = (String) getIntent().getStringExtra("restaurantName");
        TextView txtview = (TextView) findViewById(R.id.menu_text_view);
        txtview.setText(restaurantName);
    }
}
