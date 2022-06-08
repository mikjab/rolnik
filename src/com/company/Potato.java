package com.company;

public class Potato extends Vegetable {
    public Potato(long time_of_planting) {
        super(time_of_planting);
    }

    @Override
    public int getValue(long currentTime) {
        if (currentTime-this.getTime_of_planting() >= 10000)
            return 5;
        else
            return 0;
    }

    @Override
    public String getType(){
        return "Potato";
    }
}

