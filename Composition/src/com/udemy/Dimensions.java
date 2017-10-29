package com.udemy;
/*
User: Joshua Parsels
Date: 10/27/2017
Time: 3:20 PM
*/

public class Dimensions {
    private int
            width,
            height,
            depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
