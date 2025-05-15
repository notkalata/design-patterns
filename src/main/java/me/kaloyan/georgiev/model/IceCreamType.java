package me.kaloyan.georgiev.model;

import java.util.Arrays;

public enum IceCreamType {
    CHOCOLATE("Chocolate"),
    STRAWBERRY("Strawberry"),
    VANILLA("Vanilla"),
    ;

    private final String displayName;

    IceCreamType(String displayName) {

        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static IceCreamType getFromDisplayName(String displayName) {
        return Arrays.stream(IceCreamType.values())
                .filter(iceCreamType -> iceCreamType.getDisplayName().equals(displayName))
                .findFirst()
                .orElse(null);
    }
}
