package com.mc;

class FruitFactory {


    static Fruit getFruit(String type) throws Exception{
//        if("apple".equalsIgnoreCase(type)){
//            return Apple.class.newInstance();
//        }else if("banana".equalsIgnoreCase(type)){
//            return Banana.class.newInstance();
//        }else{
//            System.out.println("找不到响应的实例化类");
//            return null;
//        }
        Class fruit = Class.forName(type);
        return (Fruit)fruit.newInstance();
    }

}
