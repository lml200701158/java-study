package com.pattern.decoration;

public class RoastFood extends FoodDecoration {
    private Food food;
    public RoastFood(Food f){
        this.food = f;
    }
    @Override
    public String cook() {
        return getDecoration() + food.cook();
    }
    private String getDecoration(){
        return "烤";
    }
}
