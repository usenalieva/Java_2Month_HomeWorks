package com.makhabatusen.classwork.animals;

import com.makhabatusen.classwork.Drawable;
import com.makhabatusen.classwork.SoundProducible;

public abstract class Animal implements Drawable, SoundProducible {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
