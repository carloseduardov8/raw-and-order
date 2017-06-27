package com.raw_and_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    public ArrayList<ListItem> menuArray = new ArrayList<>();
    public ListItemAdapter adapter;
    public ListView menuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String restaurantName = (String) getIntent().getStringExtra("restaurantName");
        menuListView = (ListView) findViewById(R.id.menu_search_list_view);

        if (restaurantName.equals("McDonalds")){
            menuArray.add(new ListItem("McLanche Feliz", R.drawable.mc));
            menuArray.add(new ListItem("Big Mac", R.drawable.mc));
            menuArray.add(new ListItem("Batata Frita", R.drawable.mc));
            menuArray.add(new ListItem("Salada de Atum", R.drawable.mc));
            menuArray.add(new ListItem("Cheese Salada", R.drawable.mc));
        }
        else if(restaurantName.equals("Habbibs")){
            menuArray.add(new ListItem("Esfirra de Queijo", R.drawable.habbibs));
            menuArray.add(new ListItem("Esfirra de Carne", R.drawable.habbibs));
            menuArray.add(new ListItem("Esfirra de Chocolate", R.drawable.habbibs));
            menuArray.add(new ListItem("Beirute", R.drawable.habbibs));
            menuArray.add(new ListItem("Suco de Maracujá", R.drawable.habbibs));
        }
        else if(restaurantName.equals("BurgerKing")){
            menuArray.add(new ListItem("Triple Cheese", R.drawable.bk));
            menuArray.add(new ListItem("Batata Grande", R.drawable.bk));
            menuArray.add(new ListItem("Batata Media", R.drawable.bk));
            menuArray.add(new ListItem("Refil de Refigerante", R.drawable.bk));
            menuArray.add(new ListItem("Ice Tea", R.drawable.bk));
        }
        else if(restaurantName.equals("Bobs")){
            menuArray.add(new ListItem("Big Bobs", R.drawable.bobs));
            menuArray.add(new ListItem("Sundae", R.drawable.bobs));
            menuArray.add(new ListItem("Casquinha de Baunilha", R.drawable.bobs));
            menuArray.add(new ListItem("MilkShake", R.drawable.bobs));
            menuArray.add(new ListItem("Batata Frita", R.drawable.bobs));
        }
        else if(restaurantName.equals("KFC")){
            menuArray.add(new ListItem("Frango Frito", R.drawable.kfc));
            menuArray.add(new ListItem("Frango Frito", R.drawable.kfc));
            menuArray.add(new ListItem("Frango Frito", R.drawable.kfc));
            menuArray.add(new ListItem("Frango Frito", R.drawable.kfc));
            menuArray.add(new ListItem("Frango Frito", R.drawable.kfc));
        }

        adapter = new ListItemAdapter(this, R.layout.list_view, menuArray);
        menuListView.setAdapter(adapter);

    }
}
