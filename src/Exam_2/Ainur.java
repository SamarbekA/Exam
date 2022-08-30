package Exam_2;

import java.util.Scanner;

public class Ainur extends People {


    public Ainur(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, firstName, lastName, age, email, city, timeTable);
    }

    @Override
    public void timeTable(int n) {
        switch(n){
            case 1:
                System.out.println(getFirstName()+" works 24 hours on Monday");
                break;
            case 2:
                System.out.println(getFirstName()+" rests 24 hours on Tuesday.");
                break;
            case 3:
                System.out.println(getFirstName()+" works 24 hours on Wednesday.");
                break;
            case 4:
                System.out.println(getFirstName()+" rests 24 hours on Thursday.");
                break;
            case 5:
                System.out.println(getFirstName()+" works 24 hours on Friday.");
                break;
            case 6:
                System.out.println(getFirstName()+" rests 24 hours on Saturday.");
                break;
            case 7:
                System.out.println(getFirstName()+" goes to swimming pool on Sunday.");
                break;
        }
    }

    @Override
    public void work(String firstName) {

        System.out.println(firstName + "Ainur works at the restaurant.");
    }

    @Override
    public void ToRelax() {
        System.out.println("Doesn't have a day off.");

    }

    @Override
    public void communications() {
        System.out.println("Ainur gets along with others very well.");

    }

 }
