# Triangle-Fun
A class named Triangle that extends GeometricObject and implements the Comparable interface.


The class contains:

• Three double data fields named side1, side2, and side3, with default values 1.0 to denote three
sides of the triangle.

• A no-arg constructor that creates a default triangle.

• A constructor that creates a triangle with the specified side1, side2, and side3.

• The accessor methods for all three data fields.

• A method named getArea() that returns the area of the triangle.

• A method named getPerimeter() that returns the perimeter of this triangle.

• Overrides the equals method in the Object class. Two Triangle objects are equal if all of the sides
are in the same length.

• A method named toString() that returns a string description for the triangle. The description
is as follows:
return ”Triangle: side1 = ” + side1 + ”side2 = ” + side2 + ” side3 = ” + side3
