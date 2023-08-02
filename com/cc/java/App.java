package com.cc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Queen queen = new Queen();
        // Worker worker = new Worker();
        // Drone drone = new Drone();
        // HoneyBee honeyBee = new HoneyBee();

        // poll(queen);
        // poll(worker);
        // poll(drone);
        // poll(honeyBee);
        
        List<HoneyBee> colony = new ArrayList<>(Arrays.asList(new Queen(), 
        new Worker(), new Drone(), new HoneyBee()));

        colony.forEach(bee -> poll(bee));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

    private static void poll(HoneyBee bee) {
        output(bee.doYourJob());
        output(bee.fly());
        output("--------------------------------");
    }

}
