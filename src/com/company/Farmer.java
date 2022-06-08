package com.company;

public abstract class Farmer {
    public Farmer() {
    }

    public abstract String simulate(Garden g, int time) throws InterruptedException;
}


