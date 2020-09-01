package com.decisionmethods.mcdm.model;

public class Criterium {
    private String name;
    private Boolean isNegative;
    private double weight;

    public Criterium(String name, Boolean isNegative, double weight) {
        this.name = name;
        this.isNegative = isNegative;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNegative() {
        return isNegative;
    }

    public void setNegative(Boolean negative) {
        isNegative = negative;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
