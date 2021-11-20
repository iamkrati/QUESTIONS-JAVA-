package com.automobile.TwoWheeler;

public class Test {
    public static void main(String[] args) {
      Hero obj1=new Hero("swift","ABCD7859","krati",80);
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getSpeed());
        obj1.radio();
        Honda obj2=new Honda("vitara","UP817896","KRATI",120);
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getSpeed());
        obj2.cdplayer();
    }
}
