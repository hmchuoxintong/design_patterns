package com.mc;

public interface FruitFactory {
    Fruit getFruit();

//    public static Fruit getFruit(String type) throws Exception{
//        if("apple".equalsIgnoreCase(type)){
//            return Apple.class.newInstance();
//        }else if("banana".equalsIgnoreCase(type)){
//            return Banana.class.newInstance();
//        }else if("Pear".equalsIgnoreCase(type)){
//            return Pear.class.newInstance();
//        }else{
//            System.out.println("找不到响应的实例化类");
//            return null;
//        }
//    }

}
