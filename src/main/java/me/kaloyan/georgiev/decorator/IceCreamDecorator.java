package me.kaloyan.georgiev.decorator;

import me.kaloyan.georgiev.model.IceCream;

public abstract class IceCreamDecorator implements IceCream {

    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void prepare() {
        iceCream.prepare();
    }
}
