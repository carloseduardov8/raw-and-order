package com.raw_and_order;

/**
 * Created by Alex on 28/06/2017.
 */

public class PricedListItem {
    public String name;
    public String price;
    public int image;

    public PricedListItem(String initName, int initImage, String initPrice) {
        name = initName;
        image = initImage;
        price = initPrice;
    }
}
