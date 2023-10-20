package assignment1;

import static utilities.ArrayUtils.checkArray;

/*
Avsnitt 1.1.3 >> oppgave 5
Lag en metode public static int[] minmaks(int[] a).
Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a.
Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b
definert ved:   int[] b = {m1, m2};
Hvor mange sammenligninger bruker metoden din?

Solution:
First method minmaks(int[] a) using the other methods to find the values.
However minmaksKompendiet(int[] a) is more effective method. Reason:

Comparison one by one ho raha hai. ek dafa for bigger and ek dafa for smaller
doosry method mein saari values k liye comparison ho raha hai iss liye wo effective nahi hai
On average, the comparisons done are just a bit less than 2n - 2.
In worst case scenario, where den største ligger først, the comparisons done are 2n - 2

ChatGPT k through pata chala tha k hum yaha sirf ek iteration ko deekhy gay. EK iteration
mein n-1 comparison hoa hai for mak method and same for min method iss liye combined 2n-2 hai
*/

public class FinnMinMaks {
    public static int[] minmaks(int[] a){
        int minNr = FinnMinverdi.min(a);
        int maksNr = FinnMaksverdi.maks(a);
        int m1 = a[minNr];
        int m2 = a[maksNr];
        return new int[]{m1, m2};
    }

    public static int[] minmaksKompendiet(int[] a) {
        // Check if array is empty
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
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
}
