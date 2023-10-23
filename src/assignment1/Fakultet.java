package assignment1;

/*
Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 .
Lag en metode long fak(int n) som regner ut n!.
Hvor mange multiplikasjoner utføres i metoden?

these lines added from solution:
Hvis n = 0 eller 1 utføres ingen multiplikasjoner.
Hvis n > 1 utføres det n − 1 multiplikasjoner.

solution method:
public static long fak(int n)
  {
    if (n < 0)
      throw new IllegalArgumentException("n < 0");
    long fak = 1;

    for (int i = 2; i <= n; i++) fak *= i;

    return fak;
  }
*/

import java.util.Scanner;

public class Fakultet {

    /* ************************* Avsnitt 1.1.3 oppgave 6 ************************* */
    public static long runFindFakultet(Scanner input) {
        System.out.print("\033[1m" + "Skriv et tall: " + "\033[0m");

        String innTall = input.nextLine(); // Read user input
        int n = Integer.parseInt(innTall);

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
