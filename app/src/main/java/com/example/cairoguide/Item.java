package com.example.cairoguide;

public class Item {

    private String mTime;
    private String mTitle;
    private String mParagraph;
    private String mPrice;
    private int mImage;
    private String mPhone;
    private String mLocation;
    private String mUrl;




    public Item(String time, String title, String paragraph, String price, int image, String phone, String location, String url) {
        this.mTime = time;
        this.mTitle = title;
        this.mParagraph = paragraph;
        this.mPrice = price;
        this.mImage=image;
        this.mLocation=location;
        this.mPhone=phone;
        this.mUrl=url;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmParagraph() {
        return mParagraph;
    }
    public String getmUrl() {
        return mUrl;
    }

    public String getmPrice() {
        return mPrice;
    }

    public int getmImage() {
        return mImage;
    }
    public String getmPhone() {
        return mPhone;
    }

    public String getmLocation() {
        return mLocation;
    }
}
