package com.example.myapplication;

class Locomotive extends Train implements TrainConfiguration {
    private int maxPassengers = 0;
    private int maxSpeed = 300;

    public Locomotive(String color, String routeName) {
        super(color, routeName);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toJson() {
        return String.format("{routeName:\"%s\",maxPassengers:%s,color:\"%s\"}", getRouteName(), getMaxPassengers(), getColor());
    }

    @Override
    public String getConfiguration() {
        return String.format("Type: %s, max. speed: %s", "Locomotive", maxSpeed);
    }
}