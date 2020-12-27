package com.makhabatusen;

public class CurrencyExchanger3<T extends Number, S extends Number> implements Convertible2 <T, S> {

    private T rate;
    private S amount;


    public CurrencyExchanger3(T rate, S amount) {
        this.rate = rate;
        this.amount = amount;
    }

    public T getRate() {
        return rate;
    }

    public S getAmount() {
        return amount;
    }

    @Override
        public void convert(T rate, S amount) {
        float result = amount.floatValue()/rate.floatValue() ;
        System.out.println("Amount after conversion: " + result);
        }
    }


    
