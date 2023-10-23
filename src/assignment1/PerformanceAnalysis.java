package assignment1;

import static assignment1.ArrayOperations.*;
import static utilities.ArrayUtils.kostnader;
import static utilities.ArrayUtils.randPerm;

public class PerformanceAnalysis {
    /* ************************* Avsnitt 1.1.10 oppgave 1 ************************* */
    public static void runPerformanceAnalysis(){
        int arraySize = 100_000, antall = 2_000;    // tabellstørrelse og gjentagelser
        long tid = 0;   // for tidsmåling
        int[] arrayA = randPerm(arraySize);  // en permutasjon av 1, . .  n

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            kostnader(arrayA);
        }
        tid = System.currentTimeMillis() - tid;    // medgått tid
        System.out.println("Faste kostnader: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            runMaxVersion1(arrayA);  // Programkode 1.1.2
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks1-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            runMaxVersion2(arrayA);  // Programkode 1.1.4
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks2-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++){
            runMaxVersion3(arrayA);  // Programkode 1.1.5
        }
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks3-metoden: " + tid + " millisek");
    }
}
