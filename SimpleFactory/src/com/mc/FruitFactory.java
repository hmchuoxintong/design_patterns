package com.mc;

public class FruitFactory {
    /**
     * 获得Apple实例
     */
//    public static Fruit getApple(){
//        return new Apple();
//    }

    /**
     * 获得Banana实例
     */
//    public static Fruit getBanana(){
//        return new Banana();
//    }

    public static Fruit getFruit(String type) throws Exception{
        if("apple".equalsIgnoreCase(type)){
            return Apple.class.newInstance();
        }else if("banana".equalsIgnoreCase(type)){
            return Banana.class.newInstance();
        }else{
            System.out.println("找不到响应的实例化类");
            return null;
        }

    }

}
