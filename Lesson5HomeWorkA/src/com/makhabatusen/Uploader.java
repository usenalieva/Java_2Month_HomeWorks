package com.makhabatusen;


import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Uploader {
    private int fileWeight = 0;

    public synchronized void upload() {
        try {
            System.out.println("File is uploading to server, please wait.");
            while (fileWeight != 500) {
                fileWeight += 20;
                printProgress(System.currentTimeMillis(), 500, fileWeight);
                Thread.sleep(100);
            }
            Thread.sleep(1000);
            System.out.println("\nThe file is uploaded ✅");
        } catch (InterruptedException ignored) {
        }
    }

    private void printProgress(long startTime, long total, long current) {
        long eta = current == 0 ? 0 :
                (total - current) * (System.currentTimeMillis() - startTime) / current;

        String etaHms = current == 0 ? "N/A" :
                String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(eta),
                        TimeUnit.MILLISECONDS.toMinutes(eta) % TimeUnit.HOURS.toMinutes(1),
                        TimeUnit.MILLISECONDS.toSeconds(eta) % TimeUnit.MINUTES.toSeconds(1));

        StringBuilder string = new StringBuilder(140);
        int percent = (int) (current * 100 / total);
        string
                .append('\r')
                .append(String.join("", Collections.nCopies(percent == 0 ? 2 : 2 - (int) (Math.log10(percent)), " ")))
                .append(String.format(" %d%% [", percent))
                .append(String.join("", Collections.nCopies(percent, "=")))
                .append('>')
                .append(String.join("", Collections.nCopies(100 - percent, " ")))
                .append(']')
                .append(String.join("", Collections.nCopies((int) (Math.log10(total)) - (int) (Math.log10(current)), " ")))
                .append(String.format(" %d/%d, ETA: %s", current, total, etaHms));

        System.out.print("File is uploading to server, please wait." + string);
    }

}

