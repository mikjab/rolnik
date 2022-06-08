package com.company;

public class Beetroot extends Vegetable{
    public Beetroot(long time_of_planting) {
        super(time_of_planting);
    }

    @Override
    public int getValue(long currentTime) {
        int difference= (int) (currentTime-this.getTime_of_planting())/1000;
        int possibleValue= (int) Math.ceil(-(difference-7)*(difference-7)+10);
        if(possibleValue>0)
            return possibleValue;
        else return 0;
    }

    @Override
    public String getType(){
        return "Beetroot";
    }
}
