public class StorsteTall {

    // Checking empty array
     public static void checkArray(int[] array){
         if(array.length < 1){
             throw new java.util.NoSuchElementException("Tabellen er tom!");
         }
     }

    // Creating method  to find a biggest nr
    int finnMaksIndeks(int[] list){

        // Check if list is zero
        try{
            checkArray(list);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Finding index of the biggest number in the array
        int maxIndeks = 0;
        for(int i = 1; i < list.length; ++i){
            if(list[i] > list[maxIndeks]){
                maxIndeks = i; // indeksen oppdateres
            }
        }
        // returnerer indeksen/posisjonen til største verdi
        return maxIndeks;
    }

}
