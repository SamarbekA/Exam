package Exam_2;

import java.util.Scanner;

public class Akyl extends People {

    public Akyl(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, firstName, lastName, age, email, city, timeTable);
    }

    @Override
    public void timeTable(int n) {
        switch(n){
            case 1:
                System.out.println(getFirstName()+" doesn't work on Monday.");
                break;
            case 2:
                System.out.println(getFirstName()+" doesn't work on Tuesday.");
                break;
            case 3:
                System.out.println(getFirstName()+" doesn't work Wednesday.");
                break;
            case 4:
                System.out.println(getFirstName()+" doesn't work on Thursday.");
                break;
            case 5:
                System.out.println(getFirstName()+" doesn't work on Friday.");
                break;
            case 6:
                System.out.println(getFirstName()+" doesn't work on Saturday.");
                break;
            case 7:
                System.out.println(getFirstName()+" doesn't work on Sunday");
                break;
        }
    }

    @Override
    public void work(String firstName) {

        System.out.println("Akyl doesn't work anywhere. He is unemployed.");
    }

    @Override
    public void ToRelax() {
        System.out.println("Every year Akyl goes to Europe.");

    }

    @Override
    public void communications() {
        System.out.println("He gets along with other people well.");

    }

}
