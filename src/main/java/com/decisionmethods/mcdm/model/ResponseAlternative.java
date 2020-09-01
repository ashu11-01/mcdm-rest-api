package com.decisionmethods.mcdm.model;

import java.util.List;

public class ResponseAlternative {
    private String name;
    private List<Double> criteriaValues;
    private double score;
    private int rank;

    public ResponseAlternative(String name, List<Double> criteriaValues) {
        this.name = name;
        this.criteriaValues = criteriaValues;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getCriteriaValues() {
        return criteriaValues;
    }

    public void setCriteriaValues(List<Double> criteriaValues) {
        this.criteriaValues = criteriaValues;
    }
}
