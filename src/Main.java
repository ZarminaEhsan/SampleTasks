public class Main {
    public static void main(String[] args) {

        // Creating a list of array
        int[] list1 = {16,3,8,9,2,7,6};

        // Creating instance of a class to find the biggest nr differently
        StorsteTall method1 = new StorsteTall();

        // Finding the biggest number
        int result = method1.finnIndexNr(list1);
        System.out.println("Index of biggest number is " + result +
                " which gives the number " + list1[result] + "." );
    }
}