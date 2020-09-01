package com.decisionmethods.mcdm.model;

import java.util.List;

public class Alternative {
    private String name;
    private List<Double> criteriaValues;

    public Alternative(String name, List<Double> criteriaValues) {
        this.name = name;
        this.criteriaValues = criteriaValues;
    }

    public String getName() {
        return name;
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
