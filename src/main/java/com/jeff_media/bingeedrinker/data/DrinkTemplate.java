package com.jeff_media.bingeedrinker.data;

public record DrinkTemplate(String name, int milliliters, double percentage) {
    public static DrinkTemplate BEER_SMALL = new DrinkTemplate("Beer", 330, 5.0);
    public static DrinkTemplate BEER_LARGE = new DrinkTemplate("Beer", 500, 5.0);
    
}
