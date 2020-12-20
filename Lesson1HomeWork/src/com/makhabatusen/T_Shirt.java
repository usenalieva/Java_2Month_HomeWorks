package com.makhabatusen;

public class T_Shirt extends WomenClothing implements Cloneable {
    private Size size;

    public T_Shirt(String brand, Manufacture manufacture, Size size) {
        super(brand, manufacture);
        this.size = size;
    }

    public String info() {
        return "__________" +
                "\n" + T_Shirt.class.getSimpleName() + " info: " +
                "\nBrand: " + getBrand() +
                "\nFabric: " + getManufacture().getFabric() +
                "\nMade in: " + getManufacture().getPlaceOfManufacture() +
                "\nSize: " + size;
    }

    public String info(String color) {
        return "__________" +
                "\n" + T_Shirt.class.getSimpleName() + " info: " +
                "\nBrand: " + getBrand() +
                "\nFabric: " + getManufacture().getFabric() +
                "\nMade in: " + getManufacture().getPlaceOfManufacture() +
                "\nSize: " + size +
                "\nColor: " + color;
    }

    final String info(String color, String pattern) {
        return "__________" +
                "\n" + T_Shirt.class.getSimpleName() + " info: " +
                "\nBrand: " + getBrand() +
                "\nFabric: " + getManufacture().getFabric() +
                "\nMade in: " + getManufacture().getPlaceOfManufacture() +
                "\nSize: " + size +
                "\nColor: " + color +
                "\nPattern: " + pattern;
    }


}

