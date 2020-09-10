package com.qa.main;

public class TraineeBuilder {
    private String name = "";
    private int age = 0;
    private String technology = "nothing";

    public TraineeBuilder() {

    }

    public Trainee buildTrainee() {
        return new Trainee(name, age, technology);
    }

    public TraineeBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public TraineeBuilder buildAge(int age) {
        this.age = age;
        return this;
    }

    public TraineeBuilder buildTechnology(String tech) {
        this.technology = tech;
        return this;
    }
}
