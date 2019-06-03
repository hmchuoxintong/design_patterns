package com.mc;

public class SimpleFactory {

    public static void main(String[] args) {
        FruitFactory applefr = new AppleFactory();
        Fruit fruit = applefr.getFruit();
        fruit.get();
        FruitFactory bananafr = new BananaFactory();
        Fruit fruit1 = bananafr.getFruit();
        fruit1.get();
        FruitFactory pearfr = new PearFactory();
        Fruit fruit2 = pearfr.getFruit();
        fruit2.get();

    }
}
