package se.lexicon.TedBrink;

import java.util.Scanner;

public class ThreeAverageNumbers {

    public static void main(String[] args) {
        int n1, n2, n3;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.print("number 1? ");
        n1 = scan.nextInt();
        System.out.print("number 2? ");
        n2 = scan.nextInt();
        System.out.print("number 3? ");
        n3 = scan.nextInt();
        average = (double)(n1+n2+n3)/3;
        System.out.println("Average is: " + average);
    }
}