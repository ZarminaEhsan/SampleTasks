import assignment1.Fakultet;
import assignment1.FinnMaksverdi;
import assignment1.FinnMinMaks;
import assignment1.FinnMinverdi;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* ************************* Avsnitt 1.1.1 array ************************* */
        int[] a = {8,4,19,10,6,2,1,11,15,3,18,19,2,17,9};

        /* ************************* Avsnitt 1.1.2 maks metode ************************* */
        int maksIndeks = FinnMaksverdi.maks(a);
        System.out.println("Index of biggest number is " + maksIndeks +
                " which gives the number " + a[maksIndeks] + "." );

        /* ************************* Avsnitt 1.1.2 oppgave 2 ************************* */
        int minIndeks = FinnMinverdi.min(a);
        System.out.println("Index of smallest number is " + minIndeks +
                " which gives the number " + a[minIndeks] + "." );

        /* ************************* Avsnitt 1.1.2 oppgave 3 ************************* */
        int sisteMaksIndeks = FinnMaksverdi.sisteMaks(a);
        System.out.println("Index of last biggest number is " + sisteMaksIndeks +
                " which gives the number " + a[sisteMaksIndeks] + "." );

        /* ************************* Avsnitt 1.1.3 oppgave 5 ************************* */
        int[] value = FinnMinMaks.minmaks(a);
        System.out.println("Minimum and maximum numbers " + Arrays.toString(value));

        int[] value1 = FinnMinMaks.minmaksKompendiet(a);
        System.out.println("Minimum and maximum numbers by using effective method " + Arrays.toString(value1));

        /* ************************* Avsnitt 1.1.3 oppgave 6 ************************* */
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et tall: ");
        String innTall = input.nextLine(); // Read user input
        int tall = Integer.parseInt(innTall);
        long n = Fakultet.fak(tall);
        System.out.println("Fakultet av tallet " + tall + " blir " + n + ".");

    }
}