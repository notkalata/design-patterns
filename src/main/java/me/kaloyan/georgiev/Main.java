package me.kaloyan.georgiev;

import me.kaloyan.georgiev.singleton.IceCreamShop;

public class Main {

    public static void main(String[] args) {
        IceCreamShop.getInstance().startOrdering();
    }
}
