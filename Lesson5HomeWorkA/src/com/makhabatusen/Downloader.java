package com.makhabatusen;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Downloader extends Thread {

    Semaphore semaphore;
    CountDownLatch cdl;

    private int ID;
    private  int  downloadedFile;


    public Downloader(Semaphore semaphore, CountDownLatch cdl, int ID, int downloadedFile) {
        this.semaphore = semaphore;
        this.cdl = cdl;
        this.ID = ID;
        this.downloadedFile = downloadedFile;
    }

    @Override
    public void run() {

        try {
            semaphore.acquire();
            System.out.println("User " + ID + " is downloading the file");
            while (downloadedFile != 500) {
                downloadedFile += 100;
                Thread.sleep(1000);
            }
            System.out.println("User " + ID + " has downloaded the file✅");
            Thread.sleep(1000);
            semaphore.release();
            cdl.countDown();
            cdl.await();

        } catch (InterruptedException ignored) {
        }
    }

}
