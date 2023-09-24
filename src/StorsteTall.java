public class StorsteTall {

    // Checking empty array
     static void checkArray(int[] array){
         if(array.length < 1){
             throw new java.util.NoSuchElementException("Tabellen er tom!");
         }
     }

    // Creating method  to find a biggest nr
    int finnIndexNr(int[] list){

        // Check if list is zero
        try{
            checkArray(list);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Finding index nr of a biggest nr
        int maxNr = 0;
        for(int i = 1; i < list.length; ++i){
            if(list[i] > list[maxNr]){
                maxNr = i;
            }
        }
        return maxNr;
    }

}
