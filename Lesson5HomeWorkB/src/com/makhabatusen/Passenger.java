package com.makhabatusen;

import java.util.concurrent.CountDownLatch;

public class Passenger extends Thread {
    MySemaphore semaphore;
    CountDownLatch cdl;
    private int ID;

    public Passenger(MySemaphore semaphore, CountDownLatch cdl, int id) {
        this.semaphore = semaphore;
        this.cdl = cdl;
        this.ID = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Passenger # " + ID + " is buying a ticket, cashBox = " + semaphore.getName());
            sleep((int) (Math.random() * 3000));
            System.out.println("Passenger # " + ID + " has bought a ticket ✅");
            sleep(2000);
            semaphore.release();
            cdl.countDown();
            cdl.await();
        } catch (InterruptedException ignored) {
        }
    }
}
