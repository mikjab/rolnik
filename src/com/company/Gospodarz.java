package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Gospodarz extends Farmer {

    @Override
    public String simulate(Garden g, int time) throws InterruptedException {
        StringBuilder report= new StringBuilder("Raport: \n");
        report.append("warzywa: \n");
        StringBuilder warzywa=new StringBuilder();
        int value=0;
        long startTime=System.currentTimeMillis();
        while((System.currentTimeMillis()-startTime)/1000<time){
            Thread.sleep(1000);
            ArrayList<Integer> previousValues=g.getValues();
            for(int i=0;i<g.getNumber_of_slots();i++){
                String temp="";
                if(Objects.equals(g.getSlot(i).getType(), "Potato") &&g.getValue(i)==5){
                    temp=g.harvest(i);
                }
                else if(g.getValue(i)-previousValues.get(i)<0){
                    temp=g.harvest(i);
                }
                if(!temp.equals("")){
                    String[] infoAboutVegetable=temp.split(" ");
                    warzywa.append(infoAboutVegetable[1]).append("\n");
                    value+=Integer.parseInt(infoAboutVegetable[2]);
                    System.out.println(temp);
                }
            }
        }
        report.append(warzywa);
        report.append("value: ").append(value);
        return report.toString();
    }
}
