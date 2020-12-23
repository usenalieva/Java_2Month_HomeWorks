package com.makhabatusen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        BankAccount userAccount = new BankAccount();
        userAccount.deposit(20000);

        while (true) {
            try {
                userAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("\nYour requested amount has exceeded the limit of your balance" +
                        "\nThe remaining balance: " + e.getRemainingAmount() +
                        "\nDo you wish to withdraw the available amount?" +
                        "\nPlease choose an option: Y or N");
                String answer = scan.next();
                if (answer.equals("Y")) {
                    try {
                        userAccount.withDraw((int) userAccount.getAmount());
                        System.out.println("Please take your card.");
                    } catch (LimitException limitException) {
                    }
                } else {
                    System.out.println("Please take your card.");
                }
                return;
            }
        }
    }

}

