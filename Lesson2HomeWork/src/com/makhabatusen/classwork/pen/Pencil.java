package com.makhabatusen.classwork.pen;

public class Pencil extends Pen {
    private int id;

    public Pencil(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
