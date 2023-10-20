package assignment1;

/*
Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 .
Lag en metode long fak(int n) som regner ut n!.
Hvor mange multiplikasjoner utføres i metoden?
*/

public class Fakultet {
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
