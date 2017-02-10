package com.company;

import data.Consumer;
import data.Cubator;
import data.Kvadrator;
import data.Prostator;

public class Main {

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        int[] one = {3,3,3};
        int[] two = {10,10,10};
        Cubator cubator = new Cubator(one,consumer);
        Cubator cubator1 = new Cubator(two,consumer);
        Kvadrator kvadrator = new Kvadrator(one,consumer);
        Kvadrator kvadrator1 = new Kvadrator(two,consumer);
        Prostator prostator = new Prostator(one,consumer);
        Prostator prostator1 = new Prostator(two,consumer);
        Thread thread1 = new Thread(cubator);
        Thread thread2 = new Thread(kvadrator);
        Thread thread3 = new Thread(prostator);
        Thread thread4 = new Thread(cubator1);
        Thread thread5 = new Thread(kvadrator1);
        Thread thread6 = new Thread(prostator1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
