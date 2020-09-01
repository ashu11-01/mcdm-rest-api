package com.decisionmethods.mcdm.api;

import com.decisionmethods.mcdm.model.RequestModel;
import com.decisionmethods.mcdm.model.ResponseAlternative;
import com.decisionmethods.mcdm.service.WeightedSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/mcdm")
public class WeightedSumController {
    private final WeightedSumService service;

    @Autowired
    public WeightedSumController(WeightedSumService service) {
        this.service = service;
    }

    @PostMapping
    public List<ResponseAlternative> weightedSumMethod(@RequestBody RequestModel model){
        return service.weightedSumMethod(model);
    }
}
