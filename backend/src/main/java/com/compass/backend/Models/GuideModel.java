package com.compass.backend.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "guides")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuideModel {

    @Id
    private String id;

    private Integer learnerId;
    private String greetings;
    private String careerType;
    private List<RoadmapStep> roadmapSteps;

    public GuideModel() {}

    public GuideModel(Integer learnerId, String greetings, String careerType, List<RoadmapStep> roadmapSteps) {
        this.learnerId = learnerId;
        this.greetings = greetings;
        this.careerType = careerType;
        this.roadmapSteps = roadmapSteps;
    }
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(Integer learnerId) {
        this.learnerId = learnerId;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getCareerType() {
        return careerType;
    }

    public void setCareerType(String careerType) {
        this.careerType = careerType;
    }

    public List<RoadmapStep> getRoadmapSteps() {
        return roadmapSteps;
    }

    public void setRoadmapSteps(List<RoadmapStep> roadmapSteps) {
        this.roadmapSteps = roadmapSteps;
    }


    
}
