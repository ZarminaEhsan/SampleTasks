public class Main {
    public static void main(String[] args) {

        // Creating a list of array
        int[] list1 = {16,3,8,9,2,17,6};
        int[] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};

        // Creating instance of a class to find the biggest nr
        StorsteTall maksMetode = new StorsteTall();

        // Finding the biggest number
        int maksNr = maksMetode.finnMaksIndeks(list1);

        // Creating instance of a class to find the smallest nr
        MinsteTall minMetode = new MinsteTall();

        // Finding the smallest number
        int minNr = minMetode.finnMinIndeks(a);

        // Viser storstetallet
        System.out.println("Index of biggest number is " + maksNr +
                " which gives the number " + list1[maksNr] + "." );

        // Viser minstetallet
        System.out.println("Index of smallest number is " + minNr +
                " which gives the number " + a[minNr] + "." );
    }
}