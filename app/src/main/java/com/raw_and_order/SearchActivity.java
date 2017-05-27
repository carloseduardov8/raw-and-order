package com.raw_and_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.raw_and_order.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void searchBoxClick(View search_box_text){
        //(to-do) Searches through the list of restaurants for a name matching 'search_box_text'
    }
}