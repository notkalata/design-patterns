package me.kaloyan.georgiev.decorator;

import me.kaloyan.georgiev.model.IceCream;

public class SprinklesTopping extends IceCreamDecorator {

    public SprinklesTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding sprinkles topping.");
    }
}
