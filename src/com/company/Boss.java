package com.company;

public class Boss extends Player {

    private int numberOfSubordinates;

    public Boss(int level, int height, String name, int numberOfSubordinates) {
        super(level, height, name);
        this.numberOfSubordinates = numberOfSubordinates;

    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;

    }
}