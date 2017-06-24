package com.raw_and_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.raw_and_order.R;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    ArrayList<ListItem> restaurantArray = new ArrayList<>();
    EditText searchbox;
    ListItemAdapter adapter;
    ListView searchlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        restaurantArray.add(new ListItem("McDonalds",1));
        restaurantArray.add(new ListItem("BurgerKing",1));
        restaurantArray.add(new ListItem("KFC",1));
        restaurantArray.add(new ListItem("Bobs",1));
        restaurantArray.add(new ListItem("Habbibs",1));
        
        searchbox = (EditText) findViewById(R.id.search_box);
        searchlistview = (ListView) findViewById(R.id.search_list_view);
        
    }

    public void searchBoxClick(View search_box_text){
        String searchboxstring = (String) searchbox.getText().toString();
        ArrayList<ListItem> resultArray = new ArrayList<>();
        for (ListItem restaurant : restaurantArray){
            if (restaurant.name.contains(searchboxstring)){
                resultArray.add(restaurant);
            }
        }
        adapter = new ListItemAdapter(this, R.layout.list_view, resultArray);
        searchlistview.setAdapter(adapter);
        //(to-do) Searches through the list of restaurants for a name matching 'search_box_text'
    }
}