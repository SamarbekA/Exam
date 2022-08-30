package Exam_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Asan asan = new Asan("as01","Asan", "Joldoshev", 30, "asan@mail.com", "Bishkek",new int[]{1, 2, 3, 4, 5} );
        Uson uson = new Uson("us02", "Uson", "Aliev", 35, "uson@mail.com", "Osh", new int[] {1, 2, 3, 4, 5});
        Adyl adyl = new Adyl("ad03","Adyl", "Omorov", 36, "adyl@mail.com", "Jalal-Abad", new int[] {1, 2, 3, 4, 5});
        Akyl akyl = new Akyl("ak04", "Akyl", "Baatyrov", 40, "akyl@mail.com", "Uzgen", new int[] {1, 2, 3, 4 , 5});
        Ainur ainur = new Ainur("ai05", "Ainur", "Uranova", 42, "ainur@mail.com", "Tokmok", new int[]{1, 2, 3, 4, 5});
       People[] peopleArray = {asan, uson, adyl, akyl, ainur};

        Asan[]asans = new Asan[1];
        Uson[]usons = new Uson[1];
        Adyl[]adyls = new Adyl[1];
        Akyl[]akyls = new Akyl[1];
        Ainur[]ainurs = new Ainur[1];

        for (int i = 0; i < peopleArray.length; i++) {
            System.out.println("~~~~~~~~~~Info about " + peopleArray[i].getFirstName() + " ~~~~~~~~~");
            peopleArray[i].work(peopleArray[i].getFirstName());
            peopleArray[i].ToRelax();
            peopleArray[i].communications();
            System.out.println();

        }
        System.out.println("Please choose a day of the week (in numbers from 1 to 7): ");
            int n = scanner.nextInt();
        for (People i: peopleArray) {
                i.timeTable(n);
        }
    }
}