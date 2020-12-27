package com.makhabatusen;

public class CurrencyExchanger <T extends Number> implements Convertible<T> {

    private T rate;


    public CurrencyExchanger(T rate) {
        this.rate = rate;
    }

        @Override
        public void convert(Number amount) {
            float result = amount.floatValue()/rate.floatValue() ;
            System.out.println("Amount after conversion: " + result);
        }
    }


    
