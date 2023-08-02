package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     Queen queen = new Queen();
     Worker worker = new Worker();
     Drone drone = new Drone();

     yourJob(queen);
     yourJob(worker);
     yourJob(drone);
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

    private static void yourJob(HoneyBee bee) {
        output(bee.doYourJob());        
    }



}

