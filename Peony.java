package com.company;

public class Peony extends FlowerTemplate {

    public Peony(int i) {
        super(i);
        this.name = "piwonia";
        this.color = "czerwony";
        this.checkPrice(this.name);

    }
}
