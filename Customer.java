package com.company;

public class Customer {
    private String name;
    private int balance;
    private ShoppingCart shoppingcart = new ShoppingCart(this);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setShoppingcart(ShoppingCart shoppingcart) {
        this.shoppingcart = shoppingcart;
    }


    public Customer(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void get(FlowerTemplate flower){

        this.shoppingcart.contents.add(flower);
    }

    public ShoppingCart getShoppingCart(){
        return shoppingcart;
    }

    public void pay(){
        double sum = 0;
        int i = 0;
        while(sum<this.balance && i < shoppingcart.contents.size()){
            if(shoppingcart.contents.get(i).price == -1.0){
                shoppingcart.contents.remove(i);

            }
            else if(sum + (shoppingcart.contents.get(i).price * shoppingcart.contents.get(i).quantity)< this.balance){

                sum += shoppingcart.contents.get(i).price * shoppingcart.contents.get(i).quantity;
                i++;

            }
            else{
             for(int j = i; j<shoppingcart.contents.size();j++){
                 shoppingcart.contents.remove(i);
             }
             break;
            }

        }
        this.balance -= sum;
    }

    public int getCash(){
        return balance;
    }

    public void pack(Box box) {
        shoppingcart.contents.clear();
    }
}
