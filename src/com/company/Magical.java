package com.company;

public class Magical extends Player {

    private int numberOfSpells;

    public Magical(int level, int height, String name, int numberOfSpells){
        super(level,height,name);
        this. numberOfSpells =  numberOfSpells;
    }

    public int getNumberOfSpells() {
        return  numberOfSpells;
    }

    public void setNumberOfSpells(int  numberOfSpells) {
        this. numberOfSpells =  numberOfSpells;
    }
}
