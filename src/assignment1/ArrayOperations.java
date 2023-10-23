package assignment1;

import java.util.Arrays;
import static utilities.ArrayUtils.checkArray;

/*
Avsnitt 1.1.2 >> oppgave 3
Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
Hva må endres for at den skal returnere posisjonen til den siste?

The maks() method can be inefficient due to repeated direct array accesses, especially in the comparison a[i] > a[m]
Using a helper variable for maximum value instead of direct array access can enhance performance
maks1() will show a better way

Avsnitt 1.1.2 >> oppgave 2
Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
posisjonen til den minste verdien i en tabell.

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

public class ArrayOperations {

    /* ************************* Avsnitt 1.1.2 ineffective ************************* */
    public static int runMaxVersion1(int[] a){

        // Check if array is empty
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        int m = 0;  // indeks til foreløpig største verdi (m for maks)
        for (int i = 1; i < a.length; ++i){
            if (a[i] > a[m]){
                m = i;  // indeksen oppdateres
            }
        }
        return m;
    }

    /* ************************* Programkode 1.1.4 effective ************************* */
    public static int runMaxVersion2(int[] a){

        // Check if array is empty
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        int m = 0;  // indeks til foreløpig største verdi (m for maks)
        int maksverdi = a[m];    // største verdi
        for (int i = 1; i < a.length; ++i){
            if (a[i] > maksverdi){
                m = i;  // indeksen oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }
        return m;
    }

    /* ************************* Avsnitt 1.1.5 oppgave 1 ************************* */
    /* ******** not using i<a.length in loop condition; vaktpost concept ******** */
    public static int runMaxVersion3(int[] a){
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    }

    /* ************************* Avsnitt 1.1.2 oppgave 2 ************************* */
    public static int runMinMethod1(int[] a) {

        // Check if array is empty
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        int m = 0;  // indeks til foreløpig minste verdi (m for min)
        for (int i = 1; i < a.length; i++){
            if (a[i] < a[m]){
                m = i;  // indeksen oppdateres
            }
        }
        return m;   // returnerer indeksen/posisjonen til minste verdi
    }

    /* ************************* Avsnitt 1.2.1 oppgave 1 ************************* */
    public static int runMinMethod2(int[] a, int fra, int til) {

        // Check if array is empty
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til foreløpig minste verdi i a[fra:til> (m for min)
        int minverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }
        // posisjonen til største verdi i a[fra:til>
        return m;
    }

    /* ************************* Avsnitt 1.2.1 oppgave 1 ************************* */
    public static int runMinMethod3(int[] a, int v, int h) {

        // Check if array is empty
        if (v < 0 || h > a.length || v >= h)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = v;              // indeks til foreløpig minste verdi i a[fra:til> (m for min)
        int minverdi = a[m];   // største verdi i a[fra:til>

        for (int i = v + 1; i <= h; i++) {
            if (a[i] < minverdi) {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }
        // posisjonen til største verdi i a[fra:til>
        return m;
    }

    /* ************************* Avsnitt 1.1.2 oppgave 3 ************************* */
    public static int runSisteMaks(int[] a){

        // Check if array is empty
        int fra = 0;
        int til = a.length;
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; ++i){
            if (a[i] >= a[m]){
                m = i;  // indeksen oppdateres
            }
        }
        return m;
    }

    /* ************************* Avsnitt 1.1.3 oppgave 5 ineffective ************************* */
    public static int[] runMinMaks(int[] a){
        int minNr = runMinMethod1(a);
        int maksNr = ArrayOperations.runMaxVersion2(a);
        int m1 = a[minNr];
        int m2 = a[maksNr];
        return new int[]{m1, m2};
    }

    /* ************************* min-max-metoden effective ************************* */
    public static int[] minmaksKompendiet(int[] a) {

        int fra = 0;
        int til = a.length;
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
