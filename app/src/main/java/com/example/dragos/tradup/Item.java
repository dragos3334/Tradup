package com.example.dragos.tradup;

/**
 * Created by Dragos on 2017-01-03.
 */

public class Item {

    private String Category;
    private String SubCategory;
    private String Description;
    private Byte[] Video;
    private Byte[] Image;
    private double Latitude;
    private double Longitude;

    public Item() {
    }


    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(String subCategory) {
        SubCategory = subCategory;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Byte[] getVideo() {
        return Video;
    }

    public void setVideo(Byte[] video) {
        Video = video;
    }

    public Byte[] getImage() {
        return Image;
    }

    public void setImage(Byte[] image) {
        Image = image;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
