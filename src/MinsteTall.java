public class MinsteTall {

    int finnMinIndeks(int[] list){

        // Check if list is zero
        try{
            StorsteTall.checkArray(list);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Finding index of the smallest number in the array
        int minIndeks = 0;
        for(int i = 1; i < list.length; ++i){
            if(list[i] < list[minIndeks]){
                minIndeks = i; // indeksen oppdateres
            }
        }
        // returnerer indeksen/posisjonen til minste verdi
        return minIndeks;
    }
}
