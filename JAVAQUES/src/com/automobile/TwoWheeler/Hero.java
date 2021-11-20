package com.automobile.TwoWheeler;

public class Hero extends com.automobile.Vehicle {
   String modelname;
   String registrationnumber,ownername;
   int speed;
    public Hero(String modelname, String registrationnumber, String ownername, int speed) {
        this.modelname = modelname;
        this.registrationnumber = registrationnumber;
        this.ownername = ownername;
        this.speed = speed;
    }
    @Override
    public String getModelName() {
        return modelname;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationnumber;
    }

    @Override
    public String getOwnerName() {
        return ownername;
    }
    public  int getSpeed(){
        return speed;
    }
    public void radio(){
        System.out.println("Radio");
    }
}
