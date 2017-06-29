package com.raw_and_order;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Alex on 28/06/2017.
 */

public class PricedListItemAdapter extends ArrayAdapter<PricedListItem> {
    Context context;
    int layoutResourceId;
    ArrayList<PricedListItem> data = null;

    public PricedListItemAdapter(Context context, int layoutResourceId, ArrayList<PricedListItem> data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ItemHolder();
            holder.imgIcon = (ImageView) row.findViewById(R.id.pricedListImgIcon);
            holder.txtTitle = (TextView) row.findViewById(R.id.pricedListTxtTitle);
            holder.txtPrice = (TextView) row.findViewById(R.id.pricedListTxtPrice);

            row.setTag(holder);
        } else {
            holder = (ItemHolder) row.getTag();
        }

        PricedListItem item = data.get(position);
        holder.txtTitle.setText(item.name);
        holder.txtPrice.setText(item.price);
        holder.imgIcon.setImageResource(item.image);

        return row;
    }

    static class ItemHolder {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtPrice;
    }
}
