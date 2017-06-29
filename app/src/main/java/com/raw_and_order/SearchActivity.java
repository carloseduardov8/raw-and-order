package com.raw_and_order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    public ArrayList<ListItem> restaurantArray = new ArrayList<>();
    public EditText searchbox;
    public ListItemAdapter searchAdapter;
    public ListView searchlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setTitle("Restaurantes");

        restaurantArray.add(new ListItem("McDonalds", R.drawable.mc));
        restaurantArray.add(new ListItem("BurgerKing", R.drawable.bk));
        restaurantArray.add(new ListItem("KFC", R.drawable.kfc));
        restaurantArray.add(new ListItem("Bobs", R.drawable.bobs));
        restaurantArray.add(new ListItem("Habbibs", R.drawable.habbibs));

        searchbox = (EditText) findViewById(R.id.search_box);
        searchlistview = (ListView) findViewById(R.id.search_list_view);
        searchlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent goToItemMenu = new Intent(SearchActivity.this, MenuActivity.class);
                ListItem item = (ListItem) searchlistview.getItemAtPosition(position);
                goToItemMenu.putExtra("restaurantName", item.name);
                startActivity(goToItemMenu);
            }
        });

    }

    public void searchBoxClick(View search_box_text) {
        String searchboxstring = (String) searchbox.getText().toString();
        ArrayList<ListItem> resultArray = new ArrayList<>();
        for (ListItem restaurant : restaurantArray) {
            if (restaurant.name.contains(searchboxstring)) {
                resultArray.add(restaurant);
            }
        }
        searchAdapter = new ListItemAdapter(this, R.layout.list_view, resultArray);
        searchlistview.setAdapter(searchAdapter);
        //(to-do) Searches through the list of restaurants for a name matching 'search_box_text'
    }
}