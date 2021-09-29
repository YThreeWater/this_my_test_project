package com.yh.test;

/**
 * 单例模式-懒汉模式
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("单例懒汉模式----");
    }

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getLazySingletonInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
