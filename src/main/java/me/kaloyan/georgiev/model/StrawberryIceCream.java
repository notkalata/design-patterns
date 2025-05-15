package me.kaloyan.georgiev.model;

public class StrawberryIceCream implements IceCream {

    @Override
    public void prepare() {
        System.out.println("Preparing strawberry ice cream");
    }
}
