package com.company;

public class GeometricObject
{
    public String color;
    public boolean isFilled;
    public GeometricObject() {
        color = "BLANK";
        isFilled = false;
    }
    public GeometricObject(String c, boolean f) {
        color = c;
        isFilled = f;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public boolean getFilled() {
        return isFilled;
    }
    public double area() {
        return -1;
    }
}

