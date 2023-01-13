package com.example.myapplication;

public enum MotorState {
    STARTED("started"), STOPPED("stopped"), RUNNING("running");

    private final String state;

    MotorState(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
