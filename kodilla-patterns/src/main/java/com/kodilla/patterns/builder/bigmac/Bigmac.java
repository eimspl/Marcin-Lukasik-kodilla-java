package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final BunType bun;
    private final int burgers;
    private final SauceType sauce;
    private List<IngredientsType> ingredients;

    public static class BigmacBuilder {
        private BunType bun;
        private int burgers;
        private SauceType sauce;
        private List<IngredientsType> ingredients = new ArrayList<>();

        public BigmacBuilder bun(BunType bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(SauceType sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(IngredientsType ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(BunType bun, int burgers, SauceType sauce, List<IngredientsType> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public BunType getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
        return ingredients;
    }
}