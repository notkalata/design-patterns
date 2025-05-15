package me.kaloyan.georgiev.decorator;

import me.kaloyan.georgiev.model.IceCream;

public class ChocolateTopping extends IceCreamDecorator {
    public ChocolateTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding chocolate topping.");
    }
}
