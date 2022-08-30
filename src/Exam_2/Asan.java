package Exam_2;

import java.util.Scanner;

public class Asan extends People {

    public Asan(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, firstName, lastName, age, email, city, timeTable);
    }

    @Override
    public void work(String firstName) {
        System.out.println("He works at school.");
    }

    @Override
    public void ToRelax() {
        System.out.println("Every summer he goes to the Issyk-Kul lake two times.");

    }

    @Override
    public void communications() {
        System.out.println("He gets along with other people well.");

    }

    @Override
    public void timeTable(int n) {
        switch(n){
            case 1:
                System.out.println(getFirstName()+" WORKS ON MONDAY");
                break;
            case 2:
                System.out.println(getFirstName()+"WORKS ON TUESDAY");
                break;
            case 3:
                System.out.println(getFirstName()+"WORKS ON WEDNESDAY");
                break;
            case 4:
                System.out.println(getFirstName()+"WORKS ON THURSDAY");
                break;
            case 5:
                System.out.println(getFirstName()+"WORKS ON FRIDAY");
                break;
            case 6:
                System.out.println(getFirstName()+"spends his time with his family on SATURDAY");
                break;
            case 7:
                System.out.println(getFirstName()+"has a day off on SUNDAY");
                break;
        }
    }

 }
