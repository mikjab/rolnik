package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Garden {
    private final int number_of_slots;
    private ArrayList<Vegetable> slots;

    public Garden(int k) {
        this.number_of_slots = k;
        this.slots = new ArrayList<Vegetable>(k);

        Random rand = new Random();

        for(int i = 0; i < k;i++){
            int n = rand.nextInt(2);
            if(n==0)
                this.slots.add(new Tomato(this.getCurrentTime()));
            else
                this.slots.add(new Potato(this.getCurrentTime()));
        }

    }

    public int getNumber_of_slots() {
        return this.number_of_slots;
    }

    public long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public Vegetable getSlot(int index){
        return this.slots.get(index);
    }

    public void setSlot(int index){
        Random rand = new Random();
        int n = rand.nextInt(4);
        if(n==0)
            this.slots.set(index, new Tomato(this.getCurrentTime()));
        else if(n==1)
            this.slots.set(index, new Potato(this.getCurrentTime()));
        else if(n==2)
            this.slots.set(index, new Carrot(this.getCurrentTime()));
        else
            this.slots.set(index, new Beetroot(this.getCurrentTime()));

    }

    public int getValue(int index){
        return this.getSlot(index).getValue(this.getCurrentTime());
    }

    //------->methods for simulation
    //evaluation
    public ArrayList<Integer> getValues(){
        ArrayList<Integer> result=new ArrayList<Integer>();
        for (Vegetable warzywko : this.slots) {
            result.add(warzywko.getValue(this.getCurrentTime()));
        }
        return result;
    }

    //harvesting
    public String harvest(int index){
        String name=this.getSlot(index).getType();
        int value=this.getSlot(index).getValue(this.getCurrentTime());
        this.setSlot(index);
        return "Zebrano "+name+" "+ value;
    }
}
