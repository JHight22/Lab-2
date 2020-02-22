
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Please enter a whole number that is greater than zero");

        int numberEnteredByUser = Keyboard.nextInt();

        int sum = 0;

        for (int x = 1; x <= numberEnteredByUser; x++) {
            sum = sum + x;
        }

        System.out.println("The sum is: " + sum);
    }
}
