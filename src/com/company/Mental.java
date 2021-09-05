package com.company;

public class Mental extends Player{

    private double percentageOfBrainWork;
    private String planName;


    public Mental(int level, int height, String name, double percentageOfBrainWork, String planName){
        super(level,height,name);
        this.percentageOfBrainWork = percentageOfBrainWork;
        this.planName = planName;
    }

    public double getPercentageOfBrainWork() {
        return percentageOfBrainWork;
    }

    public void setPercentageOfBrainWork(double percentageOfBrainWork) {
        this.percentageOfBrainWork = percentageOfBrainWork;
    }

    public String getPlanName() {
        return planName;
    }

    public void  setPlanName(String  planName) {
        this.planName = planName;
    }
}
