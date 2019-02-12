package com.ocr.thomas;

public class Product {
    private String name;
    private String description;
    private double price;



    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void look(){
        System.out.println(String.format(name = " : " + price + "%n" + description));
    }





    public void buy(Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
