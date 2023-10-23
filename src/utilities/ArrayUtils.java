package utilities;

import java.util.Random;

public class ArrayUtils {

    // Checking empty array
    public static void checkArray(int[] array){
        if(array.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }
    }

    /*
    Swapping method from kompendiet,takes three parameters:
    1. int[] a: The array in which we want to swap the elements.
    2. int i: The index of the first element to be swapped.
    3. int j: The index of the second element to be swapped.

    int temp = a[i];
    This line creates a temporary integer variable temp and assigns it the value of the array "a" at index i.
    This step is necessary to temporarily store the value so that it doesn't get lost.

    a[i] = a[j];
    This line assigns the value of the array "a" at index j to the array "a" at index i.
    After this step, the original value of a[i] is gone (that's why we saved it earlier).

    a[j] = temp;
    This line assigns the original value of a[i] (which we saved in the temp variable) to the array "a" at index j.

    At the end of the method, the elements at indices i and j in the array "a" have been swapped.
     */
    public static void bytt(int[] a, int i, int j){
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    // Calculating the time it takes to simply iterate over the array without any other logic for comparison
    // Basically performance analysis
    public static int kostnader(int[] c){
        int m = 0;
        for (int i = 1; i < c.length; i++) {}  // en tom blokk
        return m;
    }

    // Tabellen med permutasjoner
    public static int[] randPerm(int n) {
        int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
        for (int i = 0; i < n; i++) a[i] = i+1;

        Random r = new Random();  // hentes fra java.util
        for (int k = n-1; k > 0; k--)
        {
            int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
        return a;
    }
}
