package com.example.list_view_pro;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustumAdapter extends BaseAdapter {
    private Context mycontext;
    private ArrayList<list_Item_model> mydata_from_model;
    private static LayoutInflater myinflater;

    public MyCustumAdapter(Context mycontext, ArrayList<list_Item_model> mydata_from_model) {
        this.mycontext = mycontext;
        this.mydata_from_model = mydata_from_model;
        myinflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public MyCustumAdapter() {
    }

    @Override
    public int getCount() {
        return mydata_from_model.size();
    }

    @Override
    public Object getItem(int position) {
        return mydata_from_model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myview = convertView;
        if (convertView != null) return myview;
         myview=myinflater.inflate(R.layout.demo_list_view,null);
        ImageView img=myview.findViewById(R.id.imageView);
        TextView title,auther,page;
                title=myview.findViewById(R.id.title);
        auther=myview.findViewById(R.id.auther);
        page=myview.findViewById(R.id.page);
        list_Item_model model=new list_Item_model();
        model=mydata_from_model.get(position);


        img.setBackgroundResource(model.getImg());
        title.setText(model.getTitle());
        auther.setText(model.getAuther());
        page.setText(String.valueOf(model.getPageCount()));




        return myview;
    }
}
