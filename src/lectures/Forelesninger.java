package lectures;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Forelesninger {

    public static void nestMaks(int[] a){
        int nest_maks = min(a[0], a[1]);
        int maks = max(a[0], a[1]);

        for(int i = 2; i < a.length; ++i){
            if(a[i] > nest_maks){
                if(a[i] > maks){
                    nest_maks = maks;
                    maks = a[i];
                }
                else{
                    nest_maks = a[i];
                }
            }
        }
        System.out.println("Maks: " + maks +"\n" +
                "Nest maks: "+ nest_maks);
    }

    public static void turneringstrer(int[] a) {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2 * n];          // turneringstreet
        System.arraycopy(a, 0, b, n, n);     // legger a bakerst i b

        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println("");

        for (int k = 2*n-2; k > 1; k -= 2) {  // lager turneringstreet
            b[k / 2] = Math.max(b[k], b[k + 1]);
        }

        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println("");

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2) {
            int tempverdi = b[k+1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        System.out.println("Maks: " + maksverdi +"\n" +
                "Nest maks: "+ nestmaksverdi);
    }
}
