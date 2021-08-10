package com;

/*1) Сделайте иерархию по геометрическим фигурам(базовый класс фигура) абстрактные методы вычисления площади/периметра
и конкретные классы треугольник, прямоугольник и т.д.*/

import com.models.figures.Hexagon;
import com.models.figures.Rectangle;
import com.models.figures.Triangle;

public class Task1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Triangle triangle = new Triangle(9, 5, 8);
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Hexagon hexagon = new Hexagon(10);
        hexagon.calculateArea();
        hexagon.calculatePerimeter();
    }
}
