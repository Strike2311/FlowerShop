package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Box{

    public ArrayList<FlowerTemplate> contents = new ArrayList<FlowerTemplate>();
    public String owner;
    public Box(Customer customer){
        this.owner = customer.getName();
        contents = (ArrayList<FlowerTemplate>) customer.getShoppingCart().contents.clone();
    }
    @Override
    public String toString(){
        String result = "Pudełko właściciel " + owner.toString() + "\n";
        for(int i = 0; i < contents.size(); i++){
            result += contents.get(i).name + ", kolor: " + contents.get(i).color + ", ilość: " + contents.get(i).quantity + ", cena: " + contents.get(i).price + "\n";
        }
        return result;
    }
}
