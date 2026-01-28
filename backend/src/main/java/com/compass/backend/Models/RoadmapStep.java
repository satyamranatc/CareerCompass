package com.compass.backend.Models;

import java.util.List;


public class RoadmapStep {
    private String stepTitle;
    private String stepDescription;
    private String stepEstimatedTime;
    private List<String> bestYouTubeChannels;
    private List<String> bestBooks;
    private String output;

    public RoadmapStep(String stepTitle, String stepDescription, String stepEstimatedTime, List<String> bestYouTubeChannels, List<String> bestBooks, String output) {
        this.stepTitle = stepTitle;
        this.stepDescription = stepDescription;
        this.stepEstimatedTime = stepEstimatedTime;
        this.bestYouTubeChannels = bestYouTubeChannels;
        this.bestBooks = bestBooks;
        this.output = output;
    }

    public RoadmapStep() {
    }

    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public String getStepEstimatedTime() {
        return stepEstimatedTime;
    }

    public void setStepEstimatedTime(String stepEstimatedTime) {
        this.stepEstimatedTime = stepEstimatedTime;
    }

    public List<String> getBestYouTubeChannels() {
        return bestYouTubeChannels;
    }

    public void setBestYouTubeChannels(List<String> bestYouTubeChannels) {
        this.bestYouTubeChannels = bestYouTubeChannels;
    }

    public List<String> getBestBooks() {
        return bestBooks;
    }

    public void setBestBooks(List<String> bestBooks) {
        this.bestBooks = bestBooks;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

}
