package com.makhabatusen;

public class CurrencyExchanger2<T extends Number> implements Convertible<T> {

    private T rate;


    public CurrencyExchanger2(T rate) {
        this.rate = rate;
    }

        @Override
        public void convert(T amount) {
            float result = amount.floatValue()/rate.floatValue() ;
            System.out.println("Amount after conversion: " + result);
        }
    }


    
