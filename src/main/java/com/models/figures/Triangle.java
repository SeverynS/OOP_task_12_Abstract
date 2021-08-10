package com.models.figures;

public class Triangle extends Figure{
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculateArea() { //формула Герона
        int p = (side1 + side2 + side3) / 2;
        int c = (p - side1) * (p - side2) * (p - side3);
        System.out.println("Triangle area is: " + (Math.sqrt(p * c)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Triangle perimeter is " + (side1 + side2 + side3));
    }
}
