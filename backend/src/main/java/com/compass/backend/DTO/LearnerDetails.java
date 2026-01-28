package com.compass.backend.DTO;

import org.springframework.stereotype.Component;

@Component
public class LearnerDetails 
{
    public String name;
    public int age;
    public String city;
    public String country;
    public String subject;
    public String goal;

    public LearnerDetails(String name, int age, String city, String country, String subject, String goal) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.subject = subject;
        this.goal = goal;
    }

    public LearnerDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    
}
