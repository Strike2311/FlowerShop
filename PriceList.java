package com.company;

import java.util.ArrayList;

public class PriceList {

    static PriceList instance = new PriceList();

    ArrayList<List> list = new ArrayList<List>();

    private PriceList(){}

    public static PriceList getInstance(){
        return instance;
    }

    public void put(String name, double price){
        List flower = new List(name, price);
        list.add(flower);
    }

class List{
        private String name;
        private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List(String name, double price){
            this.name = name;
            this.price = price;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
}
