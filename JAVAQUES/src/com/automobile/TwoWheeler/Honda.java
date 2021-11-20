package com.automobile.TwoWheeler;

public class Honda extends com.automobile.Vehicle{
    String modelname;
    String registrationnumber,ownername;
    int speed;
    public Honda(String modelname, String registrationnumber, String ownername, int speed) {
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
    public int getSpeed() {
        return speed;
    }
    public void cdplayer(){
        System.out.println("cdplayer");
    }
}
