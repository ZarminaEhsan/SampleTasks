import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};

        // Creating class instances
        StorsteTall maksMetode = new StorsteTall();
        MinsteTall minMetode = new MinsteTall();

        // Finding the biggest and smallest number
        int maksNr = maksMetode.finnMaksIndeks(a);
        int minNr = minMetode.finnMinIndeks(a);

        // Viser resultat
        System.out.println("Index of biggest number is " + maksNr +
                " which gives the number " + a[maksNr] + "." );

        System.out.println("Index of smallest number is " + minNr +
                " which gives the number " + a[minNr] + "." );

        /* ************************* Avsnitt 1.1.3 oppgave 5 ************************* */

        int[] value = minmaks(a , minMetode, maksMetode);
        System.out.println(Arrays.toString(value));

        /* ************************* effective way for oppgave 5 ************************* */

        int[] value1 = minmaks1(a);
        System.out.println(Arrays.toString(value1));

        /* ************************* Avsnitt 1.1.3 oppgave 5 ************************* */

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et tall: ");
        String innTall = input.nextLine(); // Read user input
        int tall = Integer.parseInt(innTall);
        long n = fak(tall);
        System.out.println("Fakultet av tallet " + tall + " blir " + n + ".");

    }

    public static int[] minmaks(int[] a, MinsteTall min, StorsteTall maks){

        int minNr = min.finnMinIndeks(a);
        int maksNr = maks.finnMaksIndeks(a);

        int m1 = a[minNr];
        int m2 = a[maksNr];
        int[] b = {m1, m2};

        return b;
    }

    public static int[] minmaks1(int[] a) {

        if (a == null || a.length < 1) {
            throw new IllegalArgumentException("Input array should not be null or empty");
        }

        int mi = 0, ma = 0;
        int minverdi = a[0], maksverdi = a[0];

        int verdi = 0;


        for (int i = 1; i < a.length; ++i) {

            verdi = a[i];

            if (verdi < minverdi) {
                mi = i;
                minverdi = verdi;
            } else if (verdi > maksverdi) {
                ma = i;
                maksverdi = verdi;
            }
        }
        return new int[]{minverdi, maksverdi};
    }

    public static long fak(int n){

        if(n < 0){
            throw new IllegalArgumentException(("n must be a positive interger."));
        }

        long fakultet = 1;

        for(int i = n; i > 0; --i){
            fakultet *= i;
        }
        return fakultet;
    }
}