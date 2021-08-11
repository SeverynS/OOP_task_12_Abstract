package com;

/*1) Сделайте иерархию по геометрическим фигурам(базовый класс фигура) абстрактные методы вычисления площади/периметра
и конкретные классы треугольник, прямоугольник и т.д.*/

import com.models.figures.Figure;
import com.models.figures.Hexagon;
import com.models.figures.Rectangle;
import com.models.figures.Triangle;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures = {new Hexagon(9), new Rectangle(3, 8), new Triangle(9, 5, 8)};
        for(Figure f : figures){
            f.calculateArea();
            f.calculatePerimeter();
        }
    }
}
