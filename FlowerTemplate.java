package com.company;

public abstract class FlowerTemplate {

    public String name;
    public Double price;
    public int quantity;
    public String color;
    public PriceList pl = PriceList.getInstance();
    public void checkPrice(String name){
        for(int i =0; i< pl.list.size(); i++){
            if(pl.list.get(i).getName().equals(this.name)){
                this.price = pl.list.get(i).getPrice();
            }
        }
        if(this.price == null){
            this.price = -1.0;
        }

    }
    public FlowerTemplate(int i) {
        this.quantity = i;

    }

}
