package com.company;

public class Warrior extends Player{

    private int numberOfFights;

    public Warrior(int level, int height, String name, int numberOfFights){
        super(level,height,name);
        this.numberOfFights = numberOfFights;
    }

    public int getNumberOfFights() {
        return numberOfFights;
    }

    public void setNumberOfFights(int numberOfFights) {
        this.numberOfFights = numberOfFights;
    }
}
