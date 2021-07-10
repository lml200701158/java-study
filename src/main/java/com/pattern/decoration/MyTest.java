package com.pattern.decoration;

public class MyTest {
    public static void main(String args[]) {
        // 测试单纯的食物
        Chicken chicken = new Chicken();
        System.out.println(chicken.cook());
        // 测试单重修饰的食物
        RoastFood roastFood = new RoastFood(chicken);
        System.out.println(roastFood.cook());
        // 测试多重修饰的食物
        SteamedFood steamedFood = new SteamedFood(roastFood);
        System.out.println(steamedFood.cook());
    }
}
