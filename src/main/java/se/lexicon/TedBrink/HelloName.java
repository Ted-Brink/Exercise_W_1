package se.lexicon.TedBrink;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String namn;
        Scanner scan = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        namn = scan.nextLine();
        System.out.println("Hej " + namn + "!");

    }
}

