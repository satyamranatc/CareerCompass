package com.compass.backend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compass.backend.DTO.LearnerDetails;
import com.compass.backend.Util.AskAi;

@RestController
@RequestMapping("/guide")
public class GuideController 
{

    @GetMapping("/")
    public String getGuide() {
        return "Guide";
    }
    @Autowired
    private LearnerDetails learnerDetails;   

    @Autowired
    private AskAi askAi;
    
    @PostMapping("/askAi")
    public String addGuide(@RequestBody LearnerDetails learnerDetails) {

        int learnerId = 101;
        String response = askAi.askAi(learnerDetails);
        return response;
    }
    

}
