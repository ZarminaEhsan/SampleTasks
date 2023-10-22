import java.util.*;
import assignment1.Fakultet;
import static assignment1.FinnMaksverdi.*;
import static assignment1.FinnMinMaks.*;
import static assignment1.FinnMinverdi.*;
import static utilities.ArrayUtils.*;


public class Main {

    /* ************************* Avsnitt 1.1.1 array ************************* */
    private static final int[] a = {8,4,19,10,6,2,1,11,15,3,18,19,2,17,9};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\033[1m" + "Choose an assignment to run:" + "\033[0m");
            System.out.println("1: Find largest number with version 1");
            System.out.println("2: Find largest number with version 2");
            System.out.println("3: Find largest number with version 3");
            System.out.println("4: Find smallest number");
            System.out.println("5: Find last largest number");
            System.out.println("6: Get the array containing smallest and biggest numbers");
            System.out.println("7: Find the Fakultet");
            System.out.println("8: Do performance analysis for all three maks methods.");
            System.out.println("0: Exit");

            int choice = input.nextInt();
            input.nextLine(); // important to use to take more input from the user

            switch (choice) {
                case 1 -> runMaxVersion1();
                case 2 -> runMaxVersion2();
                case 3 -> runMaxVersion3();
                case 4 -> runMinMethod();
                case 5 -> runSisteMaks();
                case 6 -> runMinMaks();
                case 7 -> runFindFakultet(input);
                case 8 -> runPerformanceAnalysis();
                case 0 -> {
                    return;  // Exit the application
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    /* ************************* Avsnitt 1.1.2 maks metode ************************* */
    private static void runMaxVersion1() {
        int maksIndeks1 = maks1(a);
        System.out.println(
                "\033[1m" + "Max number version 1" + "\033[0m" +
                        " \nIndex: " + maksIndeks1 +
                        "\nNumber: " + a[maksIndeks1]
        );
    }

    private static void runMaxVersion2(){
        int maksIndeks2 = maks2(a);
        System.out.println(
                "\033[1m" + "Max number version 2" + "\033[0m" +
                        " \nIndex: " + maksIndeks2 +
                        "\nNumber: " + a[maksIndeks2]
        );
    }

    /* ************************* Avsnitt 1.1.2 oppgave 2 ************************* */
    private static void runMinMethod() {
        int minIndeks = min(a);
        System.out.println(
                "\033[1m" + "Minimum number" + "\033[0m" +
                        " \nIndex: " + minIndeks +
                        "\nNumber: " + a[minIndeks]
        );
    }

    /* ************************* Avsnitt 1.1.2 oppgave 3 ************************* */
    private static void runSisteMaks(){
        int sisteMaksIndeks = sisteMaks(a);
        System.out.println(
                "\033[1m" + "Last biggest number" + "\033[0m" +
                        " \nIndex: " + sisteMaksIndeks +
                        "\nNumber: " + a[sisteMaksIndeks]
        );
    }

    /* ************************* Avsnitt 1.1.3 oppgave 5 ************************* */
    private static void runMinMaks(){
        int[] value = minmaks(a);
        System.out.println("Minimum and maximum numbers " + Arrays.toString(value));

        int[] value1 = minmaksKompendiet(a);
        System.out.println("Minimum and maximum numbers by using effective method " + Arrays.toString(value1));
    }

    /* ************************* Avsnitt 1.1.3 oppgave 6 ************************* */
    private static void runFindFakultet(Scanner input) {
        System.out.print("\033[1m" + "Skriv et tall: " + "\033[0m");
        String innTall = input.nextLine(); // Read user input
        int tall = Integer.parseInt(innTall);
        long n = Fakultet.fak(tall);
        System.out.println("Fakultet blir " + n);
    }

    /* ************************* Avsnitt 1.1.5 oppgave 1 ************************* */
    private static void runMaxVersion3(){
        int maksIndeks3 = maks3(a);
        System.out.println(
                "\033[1m" + "Max number version 3" + "\033[0m" +
                        " \nIndex of biggest nr: " + maksIndeks3 +
                        "\nNumber of biggest nr: " + a[maksIndeks3]
        );
    }

    /* ************************* Avsnitt 1.1.10 oppgave 1 ************************* */
    private static void runPerformanceAnalysis(){
        int arraySize = 100_000, antall = 2_000;    // tabellstørrelse og gjentagelser
        long tid = 0;   // for tidsmåling
        int arrayA[] = randPerm(arraySize);  // en permutasjon av 1, . .  n

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
