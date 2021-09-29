package com.yh.test;

public class NoLazySingleton {
    private NoLazySingleton(){
        System.out.println("单例模式-饥汉模式----");
    }

    private static NoLazySingleton noLazySingleton = new NoLazySingleton();

    public static NoLazySingleton getNoLazySingleton(){
        return noLazySingleton;
    }
}
