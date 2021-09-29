package com.yh.test.tesedemo;

import com.yh.test.NoLazySingleton;

public class testNoLazySingleton {
    public static void main(String[] args) {
        NoLazySingleton noLazySingleton1 = NoLazySingleton.getNoLazySingleton();
        NoLazySingleton noLazySingleton2 = NoLazySingleton.getNoLazySingleton();
        NoLazySingleton noLazySingleton3 = NoLazySingleton.getNoLazySingleton();
        System.out.println(noLazySingleton1);
        System.out.println(noLazySingleton2);
        System.out.println(noLazySingleton3);
    }
}
