package com.company;

public class PGR extends Farmer {

    @Override
    public String simulate(Garden g, int time) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        StringBuilder report= new StringBuilder("Raport: \n");
        report.append("warzywa: \n");
        StringBuilder warzywa=new StringBuilder();
        int value=0;
        while((System.currentTimeMillis()-startTime)/1000<time){
            Thread.sleep(11000);
            for(int i=0;i<g.getNumber_of_slots();i++){
                String temp=g.harvest(i);
                String[] infoAboutVegetable=temp.split(" ");
                warzywa.append(infoAboutVegetable[1]).append("\n");
                value+=Integer.parseInt(infoAboutVegetable[2]);
                System.out.println(temp);
            }
        }
        return report.toString();
    }

}

