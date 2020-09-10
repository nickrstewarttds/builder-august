package com.qa.main;

public class Trainee {
    // 100 different variables
    private String name;
    private int age;
    private String technology;

    // constructors
    public Trainee() {

    }

    public Trainee(String name, int age, String tech) {
        this.name = name;
        this.age = age;
        this.technology = tech;
    }

    // getters and setters
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    // toString
    @Override
    public String toString() {
        return "Trainee [name=" + name + ", age=" + age + ", technology=" + technology + "]";
    }

}
