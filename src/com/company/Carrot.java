package com.company;

public class Carrot extends Vegetable {
    public Carrot(long time_of_planting) {
        super(time_of_planting);
    }

    @Override
    public int getValue(long currentTime) {
        int difference= (int) (currentTime-this.getTime_of_planting())/1000;
        if(difference<8){
            return difference;
        }
        else if(difference<16){
            return 16-difference;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getType(){
        return "Carrot";
    }
}

