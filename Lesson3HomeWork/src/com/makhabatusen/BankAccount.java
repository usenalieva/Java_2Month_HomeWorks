package com.makhabatusen;


public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {


        String balanceInfo = "The remaining balance in your account: ";
        String limitInfo = "Your requested amount has exceeded the limit of your balance";
        String takeCard = "Please take your card.";
        if (amount >= sum) {
            amount -= sum;
            System.out.println(balanceInfo + amount);
        }
        if (amount == 0) {
            System.out.println(balanceInfo + amount + "\n" + takeCard);
            System.exit(0);
        }

        if (amount < sum) {
                throw new LimitException(limitInfo, amount);
        }
    }
}




