package me.kaloyan.georgiev.model;

public class VanillaIceCream implements IceCream {

    @Override
    public void prepare() {
        System.out.println("Preparing vanilla ice cream.");
    }
}
