package eksamensoppgaver;

public class sortering {

    public static void frekvensFordeling(int[] b){

        if(b.length == 0){
            System.out.println(0 + " " + 0);
        }

        int temp = b[0]; // value which we are calculating for frekvense
        int frekvens = 1;
        for(int i = 1; i < b.length; i++){

            if(temp == b[i]){
                frekvens++;
            } else if (temp < b[i]) {

                System.out.println(temp + " " + frekvens);
                temp = b[i];
                frekvens = 1;
            } else{
                throw new IllegalStateException("Tabellen er ikke sortert");
            }
            System.out.println(temp + " " + frekvens);
        }
    }

    public static void frekvensFordeling1(int[] a) {
        // Check for empty array
        if (a.length == 0) {
            System.out.println(0 + " " + 0);
        }

        // Check if the array is sorted
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Tabellen er ikke sortert stigende");
            }
        }
        System.out.println("Tabellen er sortert stigende");

        // Count frequencies
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " " + count);
                count = 1; // reset count for the new number
            }
        }

        // Output the count for the last number
        System.out.println(a[a.length - 1] + " " + count);
    }

}
