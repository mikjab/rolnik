package com.company;

public class Tomato extends Vegetable {
    public Tomato(long time_of_planting) {
        super(time_of_planting);
    }

    @Override
    public int getValue(long currentTime) {
        int difference= (int) (currentTime-this.getTime_of_planting())/1000;
        if (difference >= 10){
            if(difference>=15){
                if(difference<=20)
                    return 10-2*(difference-15);
                else
                    return 0;
            }
            else
                return 2*(difference-10);
        }
        else
            return 0;
    }

    @Override
    public String getType(){
        return "Tomato";
    }
}
