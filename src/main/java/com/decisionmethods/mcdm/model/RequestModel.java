package com.decisionmethods.mcdm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestModel {
    private List<Criterium> criteriumList;
    private List<Alternative> alternativeList;

    public RequestModel(@JsonProperty("criteriaList") List<Criterium> criteriumList,
                        @JsonProperty("alternativeList") List<Alternative> alternativeList) {
        this.criteriumList = criteriumList;
        this.alternativeList = alternativeList;
    }

    public List<Criterium> getCriteriumList() {
        return criteriumList;
    }

    public void setCriteriumList(List<Criterium> criteriumList) {
        this.criteriumList = criteriumList;
    }

    public List<Alternative> getAlternativeList() {
        return alternativeList;
    }

    public void setAlternativeList(List<Alternative> alternativeList) {
        this.alternativeList = alternativeList;
    }
}
