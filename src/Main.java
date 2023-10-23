import java.util.*;
import static assignment1.ArrayOperations.*;
import static assignment1.Fakultet.*;
import static assignment1.PerformanceAnalysis.*;

public class Main {

    /* ************************* Avsnitt 1.1.1 array ************************* */
    private static final int[] a = {8,4,19,10,6,2,1,11,15,3,18,19,2,17,9};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\033[1m" + "Choose a category:" + "\033[0m");
            System.out.println("1: Max/Min array operations");
            System.out.println("2: Performance analysis");
            System.out.println("3: Maths operations");
            System.out.println("0: Exit");

            int categoryChoice = input.nextInt();
            switch (categoryChoice) {
                case 1 -> showMaxMinMenu(input);
                case 2 -> showPerformanceMenu(input);
                case 3 -> showMathsOperationsMenu(input);
                case 0 -> {
                    return;  // Exit the application
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMaxMinMenu(Scanner input) {
        System.out.println("\033[1m" + "Choose an assignment to run:" + "\033[0m");
        System.out.println("1: Find largest number with version 1");
        System.out.println("2: Find largest number with version 2");
        System.out.println("3: Find largest number with version 3");
        System.out.println("4: Find smallest number");
        System.out.println("5: Find last largest number");
        System.out.println("6: Get the array containing smallest and biggest numbers");
        System.out.println("0: Exit");

        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                int index1 = runMaxVersion1(a);
                System.out.println(
                        "\033[1m" + "Max number version 1" + "\033[0m" +
                                " \nIndex: " + index1 +
                                "\nNumber: " + a[index1]
                );
            }
            case 2 -> {
                int index2 = runMaxVersion2(a);
                System.out.println(
                        "\033[1m" + "Max number version 2" + "\033[0m" +
                                " \nIndex: " + index2 +
                                "\nNumber: " + a[index2]
                );
            }
            case 3 -> {
                int index3 = runMaxVersion3(a);
                System.out.println(
                        "\033[1m" + "Max number version 3" + "\033[0m" +
                                " \nIndex: " + index3 +
                                "\nNumber: " + a[index3]
                );
            }
            case 4 -> {
                int indeks = runMinMethod(a);
                System.out.println(
                        "\033[1m" + "Minimum number" + "\033[0m" +
                                " \nIndex: " + indeks +
                                "\nNumber: " + a[indeks]
                );
            }
            case 5 -> {
                int sisteMaksIndeks = runSisteMaks(a);
                System.out.println(
                        "\033[1m" + "Last biggest number" + "\033[0m" +
                                " \nIndex: " + sisteMaksIndeks +
                                "\nNumber: " + a[sisteMaksIndeks]
                );
            }
            case 6 -> {
                int[] value = runMinMaks(a);
                System.out.println("Minimum and maximum numbers " + Arrays.toString(value));
                int[] value1 = minmaksKompendiet(a);
                System.out.println("Minimum and maximum numbers by using effective method " +
                        Arrays.toString(value1)
                );
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    private static void showPerformanceMenu(Scanner input){
        System.out.println("1: Do performance analysis for all three maks methods.");

        int choice = input.nextInt();
        if (choice == 1) {
            runPerformanceAnalysis();
        } else {
            System.out.println("Invalid choice. Try again.");
        }
    }

    private static void showMathsOperationsMenu(Scanner input) {
        System.out.println("\033[1m" + "Choose an operation:" + "\033[0m");
        System.out.println("1: Find the Fakultet");

        int choice = input.nextInt();
        input.nextLine();  // important to read input
        if (choice == 1) {
            long n = runFindFakultet(input);
            System.out.println("Fakultet blir " + n);
        } else {
            System.out.println("Invalid choice. Try again.");
        }
    }
}
