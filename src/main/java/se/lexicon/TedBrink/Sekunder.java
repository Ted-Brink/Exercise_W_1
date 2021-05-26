package se.lexicon.TedBrink;
import java.util.Scanner;

public class Sekunder {
    public static void main(String[] args) {
        int inputSek;
        int s, m, h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange antal sekunder: ");
        inputSek = scan.nextInt();
        s = inputSek%60;
        m = ((inputSek-s)/60)%60; // m = (inputsek/60)%60 fungerar tror jag
        h = inputSek/3600;

        /*test
        System.out.println("s" + s );
        System.out.println("m" + m );
        System.out.println("h" + h );*/

        String sStr, mStr, hStr;

        // För att lägga till nolla före ental,
        // troligt att det finns enklare sätt.

        if (s>9)
            sStr = String.valueOf(s);
        else if (s<10 && s!=0)
            sStr = "0" + String.valueOf(s);
        else
            sStr = "00";

        if (m>9)
            mStr = String.valueOf(m);
        else if (m<10 && m!=0 )
            mStr = "0" + String.valueOf(m);
        else
            mStr = "00";

        if (h>9)
            hStr = String.valueOf(h);
        else if (h<10 && h!=0 )
            hStr = "0" + String.valueOf(h);
        else
            hStr = "00";

        System.out.println("Tid: " + hStr +":" + mStr +":" + sStr);
    }
}
