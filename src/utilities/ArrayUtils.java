package utilities;

public class ArrayUtils {

    // Checking empty array
    public static void checkArray(int[] array){
        if(array.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }
    }
}
