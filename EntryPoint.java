package com.example.myapplication;

public class EntryPoint {
    public static void main(String args[]) {
        Locomotive locomotive = new Locomotive("red", "route");
        TrainConfiguration configuration = locomotive;
        System.out.println(locomotive.toJson());
        System.out.println(configuration.getConfiguration());
        locomotive.start();
        locomotive.run();
        locomotive.stop();
    }
}
