package com.makhabatusen;

import java.util.concurrent.CountDownLatch;

public class BusStation {

    public static void main(String[] args) {

        MySemaphore cashBox = new MySemaphore(2, "cashBox:1");
        MySemaphore cashBox1 = new MySemaphore(2, "cashBox:2");

        CountDownLatch cdl = new CountDownLatch(100 + 2);
        try {
            for (int j = 1; j <= 100; j++) {
                if (j % 2 == 0)
                    new Passenger(cashBox, cdl, j).start();
                else
                    new Passenger(cashBox1, cdl, j).start();
            }

            while (cdl.getCount() > 2) {
                Thread.sleep(100);
            }

            System.out.println("All the passengers, please take your seats!");
            cdl.countDown();
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("We're moving to Osh!");
        cdl.countDown();


    }

}

