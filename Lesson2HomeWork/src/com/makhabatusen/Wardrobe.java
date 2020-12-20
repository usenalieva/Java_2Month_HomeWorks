package com.makhabatusen;

public class Wardrobe extends Furniture implements Printable {
    private int drawers;
    private String wood;

    public Wardrobe(int price, String style, int drawers, String wood) {
        super(price, style);
        this.drawers = drawers;
        this.wood = wood;
    }

    public int getDrawers() {
        return drawers;
    }

    public String getWood() {
        return wood;
    }

    @Override
    public void print() {
        System.out.println("__________" +
                "\n"+getClass().getSimpleName() + ": " +
                "\nDrawers: " + drawers +
                "\nWood: " + wood);
        super.print();
    }
}
