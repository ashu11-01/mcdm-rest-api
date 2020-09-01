package com.decisionmethods.mcdm.service;

import com.decisionmethods.mcdm.model.Alternative;
import com.decisionmethods.mcdm.model.RequestModel;
import com.decisionmethods.mcdm.model.ResponseAlternative;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeightedSumService {

    public List<ResponseAlternative> weightedSumMethod(RequestModel requestModel){
        int criteriaSize = requestModel.getCriteriumList().size();

        List<ResponseAlternative> responseAlternativeList = new ArrayList<>();
        //calculate weighted sum for each alternative
        for(Alternative alternative : requestModel.getAlternativeList()){
            ResponseAlternative ra= new ResponseAlternative(alternative.getName(),alternative.getCriteriaValues());
            double sum=0.0;
            //for each criterium, weightedSum = weight * criteriaValue
            for(int i=0;i<criteriaSize;i++) {
                sum += requestModel.getCriteriumList().get(i).getWeight() * alternative.getCriteriaValues().get(i);
            }

            ra.setScore(sum);
            responseAlternativeList.add(ra);
        }
        return responseAlternativeList;
    }
}
