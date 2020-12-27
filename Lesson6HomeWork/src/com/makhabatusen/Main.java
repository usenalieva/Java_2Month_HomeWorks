package com.makhabatusen;

public class Main {

    public static void main(String[] args) {

        /*
         Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
         Ограничить параметры типов классом Number. В главном классе создать несколько экземпляров
         обобщенного класса.*/


        // class CurrencyExchanger and Interface Convertible
        // Here, in the convert() method can type any Number
        CurrencyExchanger<Integer> currencyExchanger = new CurrencyExchanger <>(78);
        currencyExchanger.convert(7638.567);

        // class CurrencyExchanger2 and Interface Convertible
        // this one requires amount type same as provided below ( which is -> <Double>)
        CurrencyExchanger2<Double> currencyExchanger2 = new CurrencyExchanger2<>(36.65);
        currencyExchanger2.convert(45673.40);

        // class CurrencyExchanger3 and Interface Convertible2
        // Finally here, just using numbers from already existing objects
        CurrencyExchanger3<Float, Integer> currencyExchanger3 = new CurrencyExchanger3 <>(39.4523F, 9800);
        currencyExchanger3.convert(currencyExchanger3.getRate(), currencyExchanger3.getAmount());
    }
}