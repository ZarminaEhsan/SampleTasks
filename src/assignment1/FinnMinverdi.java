package assignment1;

import static utilities.ArrayUtils.checkArray;

/*
Avsnitt 1.1.2 >> oppgave 2
Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
posisjonen til den minste verdien i en tabell.
*/
public class FinnMinverdi {

    // Finding index of the smallest number in the array
    public static int min(int[] a){

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
}
