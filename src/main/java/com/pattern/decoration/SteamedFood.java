package com.pattern.decoration;

public class SteamedFood extends FoodDecoration{
    private Food food;
    public SteamedFood(Food food) {
        this.food = food;
    }
    private String getDecoration() {
        return "蒸";
    }
    @Override
    public String cook() {
        return this.getDecoration() + food.cook();
    }
}
