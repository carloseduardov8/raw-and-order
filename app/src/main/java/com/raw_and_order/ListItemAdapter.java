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
 * Created by joao on 6/24/17.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {
    Context context;
    int layoutResourceId;
    ArrayList<ListItem> data = null;

    public ListItemAdapter(Context context, int layoutResourceId, ArrayList<ListItem> data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ItemHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }
        else
        {
            holder = (ItemHolder)row.getTag();
        }

        ListItem item = data.get(position);
        holder.txtTitle.setText(item.name);
        holder.imgIcon.setImageResource(item.image);

        return row;
    }

    static class ItemHolder {
        ImageView imgIcon;
        TextView txtTitle;
    }
}