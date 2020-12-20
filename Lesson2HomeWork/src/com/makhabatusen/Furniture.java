package com.makhabatusen;

abstract class Furniture implements Printable {
    private int price;
    private String style;

    public Furniture(int price, String style) {
        this.price = price;
        this.style = style;
    }

    public int getPrice() {
        return price;
    }

    public String style() {
        return style;
    }

    @Override
    public void print() {
        System.out.println("Price: " + price +
                           "\nStyle: " + style);

    }
}
