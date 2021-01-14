package com.company;

public class Rose extends FlowerTemplate{

    public Rose(int i){
        super(i);
        this.name = "róża";
        this.color = "czerwony";
        this.checkPrice(this.name);

    }
}
