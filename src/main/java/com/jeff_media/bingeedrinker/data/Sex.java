package com.jeff_media.bingeedrinker.data;

public enum Sex {
    MALE("Male"), FEMALE("Female"), DIVERSE("Diverse");

    private final String displayName;

    Sex(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
