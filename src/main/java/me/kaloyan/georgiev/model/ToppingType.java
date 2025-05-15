package me.kaloyan.georgiev.model;

import java.util.Arrays;

public enum ToppingType {
    CHOCOLATE("Chocolate"),
    SPRINKLES("Sprinkles"),
    ;

    private final String displayName;

    ToppingType(String displayName) {

        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static ToppingType getFromDisplayName(String displayName) {
        return Arrays.stream(ToppingType.values())
                .filter(toppingType -> toppingType.getDisplayName().equals(displayName))
                .findFirst()
                .orElse(null);
    }
}
