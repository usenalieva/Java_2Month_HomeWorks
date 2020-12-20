package com.makhabatusen;

public class Sofa extends Furniture implements Printable{
    private String frame;

    public Sofa(int price, String style, String frame) {
        super(price, style);
        this.frame = frame;
    }

    public String getFrame() {
        return frame;
    }

    @Override
    public void print() {
        System.out.println("__________" +
                "\n"+getClass().getSimpleName() + ": " +
                "\nFrame: " + frame);
        super.print();
    }
}
