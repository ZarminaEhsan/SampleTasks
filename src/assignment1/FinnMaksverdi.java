package assignment1;

import static utilities.ArrayUtils.checkArray;

/*
Avsnitt 1.1.2 >> oppgave 3
Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
Hva må endres for at den skal returnere posisjonen til den siste?
*/

public class FinnMaksverdi {

    // method from kompendiet
    public static int maks(int[] a){

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
        return m;  // returnerer indeksen/posisjonen til største verdi
    }

    public static int sisteMaks(int[] a){

        // Check if array is empty
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
        return m;  // returnerer indeksen/posisjonen til største verdi
    }
}
