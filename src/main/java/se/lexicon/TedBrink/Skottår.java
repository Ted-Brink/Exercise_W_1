package se.lexicon.TedBrink;

import java.util.Scanner;

public class Skottår
{
    public static void main(String[] args) {
        int år;
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett årtal");
        år = scan.nextInt();
        if(år % 4 == 0 && år % 100 != 0 || år % 400 == 0)
            System.out.println(år + " är skottår");
        else
            System.out.println(år + " är inte skottår");
    }
}
