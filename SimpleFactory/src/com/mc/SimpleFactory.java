package com.mc;

public class SimpleFactory {

    public static void main(String[] args) {
//        //实例化一个apple
//        Apple apple = new Apple();
//        //实力话一个Banana
//        Banana banana = new Banana();
//
//        apple.get();
//        banana.get();

        //实例化一个Apple
//        Fruit apple = new Apple();
////        apple.get();
////        Fruit banana = new Banana();
////        banana.get();

        //实例化一个工厂 静态工厂
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();

        try {
            Fruit apple = FruitFactory.getFruit("com.mc.Apple");
            Fruit banana = FruitFactory.getFruit("com.mc.Banana");
            apple.get();
            banana.get();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
