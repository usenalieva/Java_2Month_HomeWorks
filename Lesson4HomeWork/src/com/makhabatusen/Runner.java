package com.makhabatusen;

public class Runner extends Thread {
    private final int ID;
    private String getsTheBaton = " gets the Baton";
    private String runsTo = " runs to Runner ";

    public Runner(int id) {
        this.ID = id;
    }

    @Override
    public void run() {
        try {
            if (ID == 5) {
                System.out.println(getClass().getSimpleName() + " " + ID + getsTheBaton);
                System.out.println(getClass().getSimpleName() + " " + ID + " runs to Finish");
                sleep(2000);
            } else {
                Runner runner = new Runner(ID + 1);
                System.out.println(getClass().getSimpleName() + " " + ID + getsTheBaton);
                System.out.println(getClass().getSimpleName() + " " + ID + runsTo + (ID + 1));
                sleep(2000);
                runner.start();
                runner.join();
            }
            if (ID != 1) {
                System.out.println(getClass().getSimpleName() + " " + ID + runsTo + (ID - 1));
                sleep(2000);
                System.out.println(getClass().getSimpleName() + " " + (ID - 1) + getsTheBaton);
            } else {
                System.out.println("FINISH");
            }
        } catch (InterruptedException ignored) {
        }
    }
}
