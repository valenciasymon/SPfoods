package com.example.spfoods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapt extends BaseAdapter {

     Context context;
     String data2 [];
     int strimg [];
     LayoutInflater inflater;

    public ListAdapt(Context ctx, String s2[], int strimages[]){
        this.context = ctx;
        this.data2 = s2;
        this.strimg = strimages;
        inflater = LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return data2.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int positon, View convertView, ViewGroup viewGroup) {
        convertView = inflater.inflate(R.layout.stores_row, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.LVtext);
        ImageView imgView = (ImageView) convertView.findViewById(R.id.LVpic);
        txtView.setText(data2[positon]);
        imgView.setImageResource(strimg[positon]);
        return convertView;
    }
}
