package com.example.tablayoutviewpager;

public class Shoe {
    private String name;
    private String description;
    private String date;
    private String price;
    private int imageResId;

    public Shoe(String name, String description, String date, String price, int imageResId) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getDate() { return date; }
    public String getPrice() { return price; }
    public int getImageResId() { return imageResId; }
}
