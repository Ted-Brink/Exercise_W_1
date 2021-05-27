package se.lexicon.TedBrink;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int nummer, gissTal;
        nummer = (int) (Math.random() * 500) + 1;
        //System.out.println(nummer); // För test
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Vilket tal?");
            gissTal = scan.nextInt();

            if (gissTal < nummer)
                System.out.println("Talet är högre");
            else if (gissTal > nummer)
                System.out.println("Talet är lägre");
            else {
                System.out.println("Gratulerar rätt tal!");
                System.exit(0);
            }
        }
        while (true);
    }
}