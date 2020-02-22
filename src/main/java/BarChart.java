
import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        int salesForStore1;
        int salesForStore2;
        int salesForStore3;
        int salesForStore4;
        int salesForStore5;

        System.out.print("Enter today's sales for store 1: ");
        salesForStore1 = Keyboard.nextInt();

        System.out.print("Enter today's sales for store 2: ");
        salesForStore2 = Keyboard.nextInt();

        System.out.print("Enter today's sales for store 3: ");
        salesForStore3 = Keyboard.nextInt();

        System.out.print("Enter today's sales for store 4: ");
        salesForStore4 = Keyboard.nextInt();

        System.out.print("Enter today's sales for store 5: ");
        salesForStore5 = Keyboard.nextInt();

        System.out.println("\nSALES BAR CHART");

        System.out.print("Store 1: ");
        for (int i = 0; i < salesForStore1; i += 100) {
            System.out.print("*");
        }

        System.out.print("\nStore 2: ");
        for (int i = 0; i < salesForStore2; i += 100) {
            System.out.print("*");
        }

        System.out.print("\nStore 3: ");
        for (int i = 0; i < salesForStore3; i += 100) {
            System.out.print("*");
        }

        System.out.print("\nStore 4: ");
        for (int i = 0; i < salesForStore4; i += 100) {
            System.out.print("*");
        }

        System.out.print("\nStore 5: ");
        for (int i = 0; i < salesForStore5; i += 100) {
            System.out.print("*");
        }

    }
}
