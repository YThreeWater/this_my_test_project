package com.yh.test.tesedemo;

import com.yh.test.LazySingleton;

public class testLazySingleton {
    public static void main(String[] args) {
        LazySingleton lazySingletonInstance1 = LazySingleton.getLazySingletonInstance();
        LazySingleton lazySingletonInstance2 = LazySingleton.getLazySingletonInstance();
        LazySingleton lazySingletonInstance3 = LazySingleton.getLazySingletonInstance();
        System.out.println(lazySingletonInstance1 + "???111");
        System.out.println(lazySingletonInstance2);
        System.out.println(lazySingletonInstance3);
    }
}
