package com.qa.main;

public class Runner {
    public static void main(String[] args) {

        Trainee test = new TraineeBuilder()
                .buildName("Nick")
                .buildAge(25)
                .buildTechnology("Training")
                .buildTrainee();

        System.out.println(test);
        
        Trainee test2 = new TraineeBuilder()
                .buildName("Piers")
                .buildTrainee();
        
        System.out.println(test2);
        
        Trainee test3 = new TraineeBuilder()
                .buildTrainee();
        
        test3.setName("Gary");
        test3.setAge(19);
        test3.setTechnology("cheese-eating");

        System.out.println(test3);

    }
}
