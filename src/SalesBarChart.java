import java.util.Scanner;

    public class SalesBarChart {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] sales = new int[5];

            // Input sales for each store
            for (int i = 0; i < sales.length; i++) {
                System.out.print("Enter today's sales for store " + (i + 1) + ": ");
                sales[i] = scanner.nextInt();
            }

            // Display the sales bar chart
            System.out.println("\nSALES BAR CHART");
            for (int i = 0; i < sales.length; i++) {
                System.out.print("Store " + (i + 1) + ": ");
                // Print the asterisks
                for (int j = 0; j < sales[i] / 100; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

