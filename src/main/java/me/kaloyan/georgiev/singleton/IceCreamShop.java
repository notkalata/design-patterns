package me.kaloyan.georgiev.singleton;

import me.kaloyan.georgiev.factory.IceCreamFactory;
import me.kaloyan.georgiev.model.IceCream;
import me.kaloyan.georgiev.model.IceCreamType;
import me.kaloyan.georgiev.model.ToppingType;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class IceCreamShop {

    private static IceCreamShop instance;

    private IceCreamShop() {
    }

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void startOrdering() {
        Scanner scanner = new Scanner(System.in);
        IceCreamType iceCreamType = null;

        while (iceCreamType == null) {
            System.out.print("What type of ice cream do you want? (Vanilla, Chocolate and Strawberry available) ");
            iceCreamType = IceCreamType.getFromDisplayName(scanner.nextLine());
        }

        System.out.println("Preparing your " + iceCreamType.getDisplayName() + " ice cream, do you want any toppings? (Chocolate and Sprinkles available) ");
        System.out.println("Please enter your topics separated with ','. If no topics wanted type 'None'.");

        String wantedToppings = scanner.nextLine();

        List<ToppingType> toppingList = Stream.of(wantedToppings.split(","))
                .map(ToppingType::getFromDisplayName)
                .filter(Objects::nonNull)
                .toList();

        IceCream iceCream = IceCreamFactory.getIceCream(iceCreamType, toppingList);
        iceCream.prepare();

        System.out.println("Here you go!");
    }
}
