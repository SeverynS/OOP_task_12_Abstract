package com.models.figures;

public class Hexagon extends Figure{
    int lengthOfSide;

    public Hexagon(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public void calculateArea() {
        System.out.println("Hexagon area is: " + (6 * (lengthOfSide*lengthOfSide)) / (4 * Math.tan(Math.PI/6)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Hexagon perimeter is: " + (lengthOfSide * 6));
    }
}
