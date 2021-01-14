package com.company;

public class Lilac extends FlowerTemplate {

    public Lilac(int i) {
        super(i);

        this.name = "bez";
        this.color = "biały";
        this.checkPrice(this.name);

    }

}
