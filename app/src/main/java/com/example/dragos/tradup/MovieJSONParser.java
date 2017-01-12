package com.example.dragos.tradup;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MovieJSONParser {

    public static ArrayList<Item> parseFeed (String content){
        try {

            JSONObject jb= new JSONObject(content);
            JSONArray ar= jb.getJSONArray("results");


            ArrayList<Item> itemsList= new ArrayList<>();

            for( int i= 0; i < ar.length(); i ++){

                JSONObject obj= ar.getJSONObject(i);
                Item item = new Item();


                item.setCategory(obj.getString("Category"));
                item.setSubCategory(obj.getString("SubCategory"));
                item.setDescription(obj.getString("Description"));
                item.setLatitude(obj.getDouble("Image"));
                item.setLongitude(obj.getDouble("overview"));


                itemsList.add(item);

            }
            return itemsList;
        } catch (JSONException e) {
            e.printStackTrace();

            return null;
        }
    }
}

