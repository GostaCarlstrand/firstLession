package com.company;

public class Dog {
    private int number_legs = 4;
    private String sound = "";


    public Dog(String givenSound) {
        this.sound = givenSound;
    }

    public void speak(){
        System.out.println(sound);
    }

    public String getSound(){
        return sound;
    }

}
