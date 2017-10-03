package com.prenetics.loginpresenterandroid.model.data.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianjiacheng on 10/2/17.
 */

public class GoalInfo {

    private String age;
    private String gender;
    private String height;
    private String weight;
    private Integer goalSteps;
    private String whichGoal;
    private String goalWeight;
    private String heightUnit;
    private String weightUnit;
    private String startWeight;
    private String goalWeightUnit;
    private String reachGoalCalories;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getGoalSteps() {
        return goalSteps;
    }

    public void setGoalSteps(Integer goalSteps) {
        this.goalSteps = goalSteps;
    }

    public String getWhichGoal() {
        return whichGoal;
    }

    public void setWhichGoal(String whichGoal) {
        this.whichGoal = whichGoal;
    }

    public String getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(String goalWeight) {
        this.goalWeight = goalWeight;
    }

    public String getHeightUnit() {
        return heightUnit;
    }

    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getStartWeight() {
        return startWeight;
    }

    public void setStartWeight(String startWeight) {
        this.startWeight = startWeight;
    }

    public String getGoalWeightUnit() {
        return goalWeightUnit;
    }

    public void setGoalWeightUnit(String goalWeightUnit) {
        this.goalWeightUnit = goalWeightUnit;
    }

    public String getReachGoalCalories() {
        return reachGoalCalories;
    }

    public void setReachGoalCalories(String reachGoalCalories) {
        this.reachGoalCalories = reachGoalCalories;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
