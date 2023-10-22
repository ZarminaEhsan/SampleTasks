package assignment1;

import static utilities.ArrayUtils.checkArray;

/*
Avsnitt 1.1.2 >> oppgave 3
Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
Hva må endres for at den skal returnere posisjonen til den siste?

The maks() method can be inefficient due to repeated direct array accesses, especially in the comparison a[i] > a[m]
Using a helper variable for maximum value instead of direct array access can enhance performance
maks1() will show a better way
*/

public class FinnMaksverdi {

    // versjon 1 av maks-metoden method from kompendiet: ineffective hai
    public static int maks1(int[] a){

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

    // versjon 2 av maks-metoden; using less array/tabell operations when comparing; effective way
    public static int maks2(int[] a){

        // Check if array is empty
        try{
            checkArray(a);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        int m = 0;  // indeks til foreløpig største verdi (m for maks)
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; ++i){
            if (a[i] > maksverdi){
                maksverdi = a[i];     // største verdi oppdateres
                m = i;  // indeksen oppdateres
            }
        }
        return m;  // returnerer indeksen/posisjonen til største verdi
    }

    // versjon 3 av maks-metoden; not using i<a.length in loop condition; vaktpost concept
    public static int maks3(int[] a) {
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
    } // maks

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
