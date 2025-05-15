package me.kaloyan.georgiev.factory;

import me.kaloyan.georgiev.decorator.ChocolateTopping;
import me.kaloyan.georgiev.decorator.SprinklesTopping;
import me.kaloyan.georgiev.model.*;

import java.util.List;

public class IceCreamFactory {

    private IceCreamFactory() {
    }

    public static IceCream getIceCream(IceCreamType type, List<ToppingType> toppingTypes) {
        IceCream iceCream = getIceCream(type);

        for (ToppingType topping : toppingTypes) {
            iceCream = addTopping(iceCream, topping);
        }

        return iceCream;
    }

    private static IceCream getIceCream(IceCreamType type) {
        return switch (type) {
            case VANILLA -> new VanillaIceCream();
            case CHOCOLATE -> new ChocolateIceCream();
            case STRAWBERRY -> new StrawberryIceCream();
        };
    }

    private static IceCream addTopping(IceCream iceCream, ToppingType type) {
        return switch (type) {
            case CHOCOLATE -> new ChocolateTopping(iceCream);
            case SPRINKLES -> new SprinklesTopping(iceCream);
        };
    }
}
