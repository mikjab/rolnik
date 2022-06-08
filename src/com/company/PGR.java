package com.company;

public class PGR extends Farmer {

    @Override
    public String simulate(Garden g, int time) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        StringBuilder report= new StringBuilder("Raport: \n");
        while((System.currentTimeMillis()-startTime)/1000<time){
            Thread.sleep(11000);
            for(int i=0;i<g.getNumber_of_slots();i++){
                String temp=g.harvest(i);
                System.out.println(temp);
                report.append(temp);
                report.append("\n");
            }
        }
        return report.toString();
    }

}

