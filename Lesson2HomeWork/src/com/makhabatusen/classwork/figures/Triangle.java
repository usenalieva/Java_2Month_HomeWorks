package com.makhabatusen.classwork.figures;

import com.makhabatusen.classwork.figures.Figure;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(String name,int a, int b, int c) {
        super.setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public void calculatePerimeter() {
        System.out.println("Perimeter of triangle is " + (a+b+c));
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A";
    }
}
