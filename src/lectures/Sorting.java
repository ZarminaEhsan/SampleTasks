package lectures;

public class Sorting {
    public static void quickSort(int[] array, int begin, int end) {

        // eventually we won't be able to divide our array further so that's when we will stop
        if (end <= begin) {
            return;
        }
        // location of pivot by sorting elements to the left and right of it
        int pivot = partition(array, begin, end);

        // left partition
        quickSort(array, begin, pivot - 1);

        // right partition
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int begin, int end) {

        int pivot = array[end];
        System.out.println("Pivot: " + pivot);

        int i = begin - 1;
        int temp;

        for( int j = begin; j < end; j++){

            if(array[j] < pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //inserting pivot on its resting place
        i++;
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}

