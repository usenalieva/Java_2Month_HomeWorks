package com.makhabatusen.classwork.figures;

import com.makhabatusen.classwork.Drawable;

public abstract class Figure  implements Drawable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void calculatePerimeter ();

}
