package com.company;

public class Player {

    private int level;
    private int height;
    private String name;


    public Player(int level, int height, String name){
        this.level = level;
        this.height = height;
        this.name = name;

    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }




}
