package com.raw_and_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    public ArrayList<PricedListItem> menuArray = new ArrayList<>();
    public PricedListItemAdapter adapter;
    public ListView menuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Cardapio");

        String restaurantName = (String) getIntent().getStringExtra("restaurantName");
        menuListView = (ListView) findViewById(R.id.menu_search_list_view);

        if (restaurantName.equals("McDonalds")){
            menuArray.add(new PricedListItem("McLanche Feliz", R.drawable.mc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Big Mac", R.drawable.mc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Batata Frita", R.drawable.mc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Salada de Atum", R.drawable.mc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Cheese Salada", R.drawable.mc, "R$ 5,00"));
        }
        else if(restaurantName.equals("Habbibs")){
            menuArray.add(new PricedListItem("Esfirra de Queijo", R.drawable.habbibs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Esfirra de Carne", R.drawable.habbibs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Esfirra de Chocolate", R.drawable.habbibs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Beirute", R.drawable.habbibs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Suco de Maracujá", R.drawable.habbibs, "R$ 5,00"));
        }
        else if(restaurantName.equals("BurgerKing")){
            menuArray.add(new PricedListItem("Triple Cheese", R.drawable.bk, "R$ 5,00"));
            menuArray.add(new PricedListItem("Batata Grande", R.drawable.bk, "R$ 5,00"));
            menuArray.add(new PricedListItem("Batata Media", R.drawable.bk, "R$ 5,00"));
            menuArray.add(new PricedListItem("Refil de Refigerante", R.drawable.bk, "R$ 5,00"));
            menuArray.add(new PricedListItem("Ice Tea", R.drawable.bk, "R$ 5,00"));
        }
        else if(restaurantName.equals("Bobs")){
            menuArray.add(new PricedListItem("Big Bobs", R.drawable.bobs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Sundae", R.drawable.bobs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Casquinha de Baunilha", R.drawable.bobs, "R$ 5,00"));
            menuArray.add(new PricedListItem("MilkShake", R.drawable.bobs, "R$ 5,00"));
            menuArray.add(new PricedListItem("Batata Frita", R.drawable.bobs, "R$ 5,00"));
        }
        else if(restaurantName.equals("KFC")){
            menuArray.add(new PricedListItem("Frango Frito", R.drawable.kfc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Frango Frito", R.drawable.kfc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Frango Frito", R.drawable.kfc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Frango Frito", R.drawable.kfc, "R$ 5,00"));
            menuArray.add(new PricedListItem("Frango Frito", R.drawable.kfc, "R$ 5,00"));
        }

        //adapter = new PricedListItemAdapter(this, R.layout.list_view, menuArray);
        //menuListView.setAdapter(adapter);

    }
}
