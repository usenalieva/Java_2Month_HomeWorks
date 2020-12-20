package com.makhabatusen.classwork.figures;

import com.makhabatusen.classwork.figures.Figure;

public class Square extends Figure {
    private int a;

    public Square (String name, int a ) {
        super.setName(name);
        this.a = a;
    }
    public int getA () {
        return a;
    }

    public void calculatePerimeter () {
        System.out.println("Perimeter of Square is " + 4*a);

    }

    @Override
    public String draw() {
        return "\uD83D\uDFE9";
    }
}
