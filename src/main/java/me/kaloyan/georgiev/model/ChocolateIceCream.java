package me.kaloyan.georgiev.model;

public class ChocolateIceCream implements IceCream {

    @Override
    public void prepare() {
        System.out.println("Preparing chocolate ice cream");
    }
}
