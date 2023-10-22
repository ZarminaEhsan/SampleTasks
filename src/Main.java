import java.util.*;
import assignment1.Fakultet;
import static assignment1.FinnMaksverdi.*;
import static assignment1.FinnMinMaks.*;
import static assignment1.FinnMinverdi.*;
import static utilities.ArrayUtils.*;


public class Main {
    public static void main(String[] args) {

        /* ************************* Avsnitt 1.1.1 array ************************* */
        int[] a = {8,4,19,10,6,2,1,11,15,3,18,19,2,17,9};

        /* ************************* Avsnitt 1.1.2 maks metode ************************* */
        int maksIndeks1 = maks1(a);
        System.out.println(
                "\033[1m" + "Max number version 1" + "\033[0m" +
                " \nIndex of biggest nr: " + maksIndeks1 +
                "\nNumber of biggest nr: " + a[maksIndeks1]
        );

        System.out.println();
        int maksIndeks2 = maks2(a);
        System.out.println(
                "\033[1m" + "Max number version 2" + "\033[0m" +
                        " \nIndex of biggest nr: " + maksIndeks2 +
                        "\nNumber of biggest nr: " + a[maksIndeks2]
        );
        System.out.println();

        /* ************************* Avsnitt 1.1.2 oppgave 2 ************************* */
        int minIndeks = min(a);
        System.out.println(
                "\033[1m" + "Minimum number" + "\033[0m" +
                        " \nIndex of smallest nr: " + minIndeks +
                        "\nNumber of smallest nr: " + a[minIndeks]
        );
        System.out.println();

        /* ************************* Avsnitt 1.1.2 oppgave 3 ************************* */
        int sisteMaksIndeks = sisteMaks(a);
        System.out.println(
                "\033[1m" + "Last max number" + "\033[0m" +
                        " \nIndex of biggest nr: " + sisteMaksIndeks +
                        "\nNumber of biggest nr: " + a[sisteMaksIndeks]
        );
        System.out.println();

        /* ************************* Avsnitt 1.1.3 oppgave 5 ************************* */
        int[] value = minmaks(a);
        System.out.println("Minimum and maximum numbers " + Arrays.toString(value));

        int[] value1 = minmaksKompendiet(a);
        System.out.println("Minimum and maximum numbers by using effective method " + Arrays.toString(value1));
        System.out.println();

        /* ************************* Avsnitt 1.1.3 oppgave 6 ************************* */
        Scanner input = new Scanner(System.in);
        System.out.print("\033[1m" + "Skriv et tall: " + "\033[0m");
        String innTall = input.nextLine(); // Read user input
        int tall = Integer.parseInt(innTall);
        long n = Fakultet.fak(tall);
        System.out.println("Fakultet blir " + n);
        System.out.println();

        /* ************************* Avsnitt 1.1.5 oppgave 1 ************************* */
        int maksIndeks3 = maks3(a);
        System.out.println(
                "\033[1m" + "Max number version 3" + "\033[0m" +
                        " \nIndex of biggest nr: " + maksIndeks3 +
                        "\nNumber of biggest nr: " + a[maksIndeks3]
        );
        System.out.println();

        /* ************************* Avsnitt 1.1.10 oppgave 1 ************************* */

        int arraySize = 100_000, antall = 2_000;    // tabellstørrelse og gjentagelser
        long tid = 0;   // for tidsmåling
        int arrayA[] = randPerm(arraySize);  // en permutasjon av 1, . .  n

        System.out.println("\033[1m" + "Performance analysis" + "\033[0m");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            kostnader(arrayA);
        }
        tid = System.currentTimeMillis() - tid;    // medgått tid
        System.out.println("Faste kostnader: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            maks1(arrayA);  // Programkode 1.1.2
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks1-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            maks2(arrayA);  // Programkode 1.1.4
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks2-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            maks3(arrayA);  // Programkode 1.1.5
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks3-metoden: " + tid + " millisek");
    }
}