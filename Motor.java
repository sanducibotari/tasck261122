package com.example.myapplication;

class Motor {
    private MotorState motorState;

    public Motor() {
        motorState = MotorState.STOPPED;
    }

    public void start() {
        if (motorState == MotorState.STOPPED) {
            motorState = MotorState.STARTED;
        } else {
            System.out.format("Motor can't start, state: %s", motorState.getState());
        }
    }

    public void run() {
        if (motorState == MotorState.STARTED) {
            motorState = MotorState.RUNNING;
        } else {
            System.out.format("Motor can't run, state: %s", motorState.getState());
        }
    }

    public void stop() {
        if (motorState == MotorState.RUNNING) {
            motorState = MotorState.STOPPED;
        } else {
            System.out.format("Motor can't stop, state: %s", motorState.getState());
        }
    }
}