package com.example.list_view_pro;

public class list_Item_model {
    private int img;
    private String title;
    private String auther;
    private int pageCount;


    public list_Item_model() {
    }


    public list_Item_model(int img, String title, String auther, int pageCount) {
        this.img = img;
        this.title = title;
        this.auther = auther;
        this.pageCount = pageCount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }





}
