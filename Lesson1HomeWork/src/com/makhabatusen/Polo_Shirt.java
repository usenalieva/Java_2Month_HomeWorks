package com.makhabatusen;

final class Polo_Shirt extends T_Shirt {
    private String sign;

    public Polo_Shirt(String brand, Manufacture manufacture, Size size, String sign) {
        super(brand, manufacture, size);
        this.sign = sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }


    @Override
    public String info() {
        return super.info() +
                "\nSign: " + sign;
    }

    @Override
    public String info(String color) {
        return super.info(color) +
                "\nSign: " + sign;
    }


    // creating a CLONING OBJECT METHOD
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // creating a CLONING FIELDS METHOD
    public <T extends T_Shirt> void copyDetails(T object) {
        setBrand(object.getBrand());
        getManufacture().setFabric(object.getManufacture().getFabric());

    }
}
