package com.makhabatusen.classwork.figures;

public class Circle extends Figure {
    private final double PI = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super.setName(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Circle is " + PI*radius);

    }

    @Override
    public String draw() {
        return "⭕";
    }
}
