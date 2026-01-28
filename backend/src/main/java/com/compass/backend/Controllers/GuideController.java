package com.compass.backend.Controllers;

import org.checkerframework.checker.units.qual.g;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compass.backend.DTO.LearnerDetails;
import com.compass.backend.Models.GuideModel;
import com.compass.backend.Repo.GuideResponseRepository;
import com.compass.backend.Util.AskAi;

import tools.jackson.databind.ObjectMapper;

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


    @Autowired
    private GuideResponseRepository guideResponseRepository;
    
    @PostMapping("/askAi")
    public GuideModel addGuide(@RequestBody LearnerDetails learnerDetails) {

        int learnerId = 101;
        String aiResponse = askAi.askAi(learnerDetails);

        ObjectMapper objMaper = new ObjectMapper();

        GuideModel guideResponse = objMaper.readValue(aiResponse, GuideModel.class); 

        guideResponse.setLearnerId(learnerId);

        return guideResponseRepository.save(guideResponse);
    }
    

}
