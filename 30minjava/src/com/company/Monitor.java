package com.company;

public class Monitor {
    private String model;
    private String manufactuer;
    private int size;
    private Resolution nativeResoltuion;

    public Monitor(String model, String manufactuer, int size, Resolution nativeResoltuion) {
        this.model = model;
        this.manufactuer = manufactuer;
        this.size = size;
        this.nativeResoltuion = nativeResoltuion;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }
}
