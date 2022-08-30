package Exam_2;

import java.util.Scanner;

public class Adyl extends People {
    public Adyl(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, firstName, lastName, age, email, city, timeTable);
    }

    @Override
    public void timeTable(int n) {
        switch(n){
            case 1:
                System.out.println(getFirstName()+" work on Monday.");
                break;
            case 2:
                System.out.println(getFirstName()+" work on Tuesday.");
                break;
            case 3:
                System.out.println(getFirstName()+" work on Wednesday.");
                break;
            case 4:
                System.out.println(getFirstName()+" works on Thursday.");
                break;
            case 5:
                System.out.println(getFirstName()+" works on Friday.");
                break;
            case 6:
                System.out.println(getFirstName()+" plays football on Saturday.");
                break;
            case 7:
                System.out.println(getFirstName()+" has a rest on Sunday.");
                break;
        }
    }


    @Override
    public void work(String firstName) {
        System.out.println("Adyl works for a bank.");
    }

    @Override
    public void ToRelax() {
        System.out.println("Every six months Adyl flies to Turkey for vacation.");

    }

    @Override
    public void communications() {
        System.out.println("He gets along with people well.");

    }




}
