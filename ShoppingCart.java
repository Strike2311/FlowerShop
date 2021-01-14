package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<FlowerTemplate> contents = new ArrayList<FlowerTemplate>();
    public String owner;
    public ShoppingCart(Customer customer){
        this.owner = customer.getName();
    }
    @Override
    public String toString(){
        String result = "Wózek właściciel "+ owner + "\n";

        for(int i = 0; i < contents.size(); i++){
            result += contents.get(i).name + ", kolor: " + contents.get(i).color + ", ilość: " + contents.get(i).quantity + ", cena: " + contents.get(i).price+ "\n";
        }
        return result;
    }
}
