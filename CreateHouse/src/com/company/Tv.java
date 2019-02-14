package com.company;

public class Tv {
    public int height;
    public int width;
    public int depth;
    public boolean isHung;

    public Tv(int height, int width, int depth, boolean isHung) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.isHung = isHung;
    }

    public void thisIsMyTv(){
        System.out.println("my tv is bigger");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isHung() {
        return isHung;
    }
}
