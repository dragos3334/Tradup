package com.example.dragos.tradup;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Dragos on 2016-09-25.
 */

public class MyArrayAdapter extends ArrayAdapter<Item> {

    private LruCache<Integer,Bitmap> imagaeCache;


    public MyArrayAdapter(Activity context, ArrayList<Item> movies) {

        super(context, 0, movies);

        final  int maxMemory= (int)(Runtime.getRuntime().maxMemory()/1024);
        final  int cacheSize= maxMemory/8;
        imagaeCache= new LruCache<>(cacheSize);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView.inflate(getContext(),R.layout.item_list_item,null);

        Item currentItem = getItem(position);

        TextView Category = (TextView) listItemView.findViewById(R.id.item_category);
        Category.setText(currentItem.getCategory());

        TextView SubCategory = (TextView) listItemView.findViewById(R.id.item_subcategory);
        SubCategory.setText(currentItem.getSubCategory());



        return listItemView;
    }



}

