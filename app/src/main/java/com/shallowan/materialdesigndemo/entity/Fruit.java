package com.shallowan.materialdesigndemo.entity;

/**
 * Created by ShallowAn on 2018/5/10.
 */
public class Fruit {
    private String name;

    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
