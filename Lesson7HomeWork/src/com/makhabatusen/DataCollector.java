package com.makhabatusen;

import java.util.*;

public class DataCollector {

    public void collectTheData() {

        try {

            // List A
            ArrayList<String> dataA = new ArrayList<>(5);
            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter your name: ");
                Scanner scan = new Scanner(System.in);
                String reservedData = scan.nextLine();
                dataA.add(reservedData);
            }

            Thread.sleep(3000);
            System.out.println("__________" +
                    "\nData A list: ");
            Iterator<String> iter = dataA.iterator();
            while (iter.hasNext()) {
                String i = iter.next();
                System.out.println(i);
            }


            // List B
            ArrayList<String> dataB = new ArrayList<>(5);
            for (int i = 0; i < 5; i++) {
                System.out.println("__________" +
                        "\nPlease enter your name: ");
                Scanner scan = new Scanner(System.in);
                String reservedData = scan.nextLine();
                dataB.add(reservedData);
            }

            Thread.sleep(3000);
            System.out.println("__________" +
                    "\nNew Data B list: ");
            Iterator<String> iter2 = dataB.iterator();
            while (iter2.hasNext()) {
                String i = iter2.next();
                System.out.println(i);
            }


            // List B reversed
            Collections.reverse(dataB);
            Thread.sleep(3000);
            System.out.println("__________" +
                    "\nReversed Data B: ");
            iter2 = dataB.iterator();
            while (iter2.hasNext()) {
                String i = iter2.next();
                System.out.println(i);
            }


            // Data C
            int a = 0, b = 0;
            ArrayList<String> dataC = new ArrayList<>();

            while (a < dataA.size() || b < dataB.size()) {
                if (a < dataA.size())
                    dataC.add(dataA.get(a++));
                if (b < dataB.size())
                    dataC.add(dataB.get(b++));
            }

            Thread.sleep(3000);
            System.out.println("__________" +
                    "\nDataC: ");
            Iterator<String> iter3 = dataC.iterator();
            while (iter3.hasNext()) {
                String i = iter3.next();
                System.out.println(i);
            }

            // Data C ordered by Length Size (small to big)
            Comparator<String> comparator = Comparator.comparingInt(String::length);
            dataC.sort(comparator);

            Thread.sleep(3000);
            System.out.println("__________" +
                    "\nDataC by length order: ");
            Iterator<String> iter4 = dataC.iterator();
            while (iter4.hasNext()) {
                String i = iter4.next();
                System.out.println(i);
            }
        } catch (InterruptedException ignored) {}
    }
}

