package org.example;

import org.obs.Observer;

public class ClothesShoppingItem implements Observer {

    private String name;

    private Double previousprice;
    private OnlineShoppingSubscriber onlineShoppingSubscriber;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return previousprice;
    }

    public ClothesShoppingItem(String name, Double price, OnlineShoppingSubscriber onlineShoppingSubscriber) {
        this.name = name;
        this.previousprice = onlineShoppingSubscriber.getPrice();
        onlineShoppingSubscriber.addSubscriber(this);
    }

    @Override
    public void notificationToAllSubscribers() {
        System.out.println("["+name+"]: price got change:hurry up"+ previousprice+onlineShoppingSubscriber.getPrice());
        previousprice=onlineShoppingSubscriber.getPrice();

    }
}
