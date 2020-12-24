package com.makhabatusen;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        CountDownLatch cdl = new CountDownLatch(10+1);

        new Uploader().upload();

        try {
            for (int i = 1; i <= 10; i++) {
                Downloader downloader = new Downloader(semaphore, cdl, i,0);
                downloader.start();
                }
            while (cdl.getCount() > 1) {
                Thread.sleep(500);
            }
            Thread.sleep(2000);
            System.out.println("The file was deleted from Server");
            cdl.countDown();
        } catch (InterruptedException e) {}

    }
}
