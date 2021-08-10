package com.models.figures;

public class Rectangle extends Figure{
    int side1;
    int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area is: " + (side1 * side2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle perimeter is: " + (side1 + side2));
    }
}
