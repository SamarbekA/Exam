package Exam_2;

import java.util.Scanner;

public class Uson extends People {
    public Uson(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, firstName, lastName, age, email, city, timeTable);
    }


    @Override
    public void work(String firstName) {
        System.out.println("He works as a trainer at the Gym");
    }

    @Override
    public void ToRelax() {
        System.out.println("In Summer he goes to the USA to spend his vacation and does some side hustle!");

    }

    @Override
    public void communications() {
        System.out.println("He doesn't get along with other people.");

    }

    @Override
    public void timeTable(int n) {
        switch(n){
            case 1:
                System.out.println(getFirstName()+" works on Monday.");
                break;
            case 2:
                System.out.println(getFirstName()+" works on Tuesday.");
                break;
            case 3:
                System.out.println(getFirstName()+" works on Wendesday.");
                break;
            case 4:
                System.out.println(getFirstName()+" works on Thursday.");
                break;
            case 5:
                System.out.println(getFirstName()+" works on Friday.");
                break;
            case 6:
                System.out.println(getFirstName()+" has a day off on Saturday.");
                break;
            case 7:
                System.out.println(getFirstName()+" has a day off on Sunday.");
                break;
        }
    }
}
