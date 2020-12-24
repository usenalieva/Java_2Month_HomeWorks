package com.makhabatusen;

import java.util.concurrent.Semaphore;

public class MySemaphore extends Semaphore {
    private String name;

    public MySemaphore(int permits, String name) {
        super(permits);
        this.name = name;
    }

    public MySemaphore(int permits) {
        super(permits);
    }

    public String getName() {
        return name;
    }
}
