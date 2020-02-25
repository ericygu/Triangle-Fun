package com.company;

public class Triangle extends GeometricObject implements Comparable {
    //Three double data fields
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    //No-arg constructor that creates a default triangle
    public Triangle() {

    }

   //Constructor with all 3 side fields, side1, side2 and side3
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //Accessor methods for all 3 data fields (side1, side2, side3) below
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    //Since it may not be a right angle triangle, we must find another way other than side1*side2/2; so we use Heron's formula
    //to solve for the Area
    @Override
    //we have to call this area because the GeometricObject class has one called area
    public double area() {
        //Create s so we can use Heron's Formula
        double s = (side1 + side2 + side3)/2;
        //use Heron's formula
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    //in order to create a getArea() method that still works with this case, we will have to make it call area()
    public double getArea() {
        return area();
    }

    //Perimeter is much easier to get, just all three side lengths added together
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    //Overriding the equals method
    //We must have a parameter object from the Triangle class, and boolean fits best to test if the triangles sides are
    //equal
    public boolean equals(Triangle triangle) {

        double[] sides = new double[3];
        sides[0] = triangle.getSide1();
        sides[1] = triangle.getSide2();
        sides[2] = triangle.getSide3();

        if (this.getPerimeter() == triangle.getPerimeter()) {
            for (int i = 0; i < 3; i++) {
                if (this.side1 == sides[i]) {
                    for (int j = 0; j < 3; j++) {
                        if (this.side2 == sides[j]) {
                            for (int k = 0; k < 3; k++) {
                                if (this.side3 == sides[k]) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        else

            return false;

    }

    //toString method that returns description
    public String toString() {
        return "Triangle: side 1 = " + side1 + "side2 = " + side2 + " side3 = " + side3;
    }

    //sumArea method, have x be the amount of objects in this 1D array
    public static double sumArea(GeometricObject[] a) {
        //Initialize a 0 value so we can add
        double sumArea = 0;
        //Make a loop so that all the areas of the array is added
        for (int i = 0; i < a.length; i++) {
            sumArea += a[i].area();
        }
        return sumArea;
    }

    //Main method
    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
