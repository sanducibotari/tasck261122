package com.example.myapplication;

abstract class Train {
    //caracteristics
    private String routeName;
    private String color;

    //components
    private final Motor motor;

    public Train(String color, String routeName) {
        this.color = color;
        this.routeName = routeName;
        motor = new Motor();
    }

    public void start() {
        motor.start();
    }

    public void run() {
        motor.run();
    }

    public void stop() {
        motor.stop();
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getColor() {
        return color;
    }

    public String toJson() {
        return String.format("{routeName:\"%s\",color:\"%s\"}", routeName, color);
    }
}