package com.company;

public abstract class Vegetable {
    private long time_of_planting;

    public Vegetable(long time_of_planting) {
        this.time_of_planting = time_of_planting;
    }

    public long getTime_of_planting() {
        return time_of_planting;
    }

    public void setTime_of_planting(int time_of_planting) {
        this.time_of_planting = time_of_planting;
    }

    public abstract int getValue(long currentTime);

    public abstract String getType();
}

