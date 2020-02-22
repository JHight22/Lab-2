
import java.text.DecimalFormat;
import java.util.Scanner;

public class BankCharges {

    public static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        int bankChargesBaseFee = 10;

        System.out.println("How many checks have been written for the month?");

        int checksWrittenThisMonth = Keyboard.nextInt();

        if (checksWrittenThisMonth < 20) {
            System.out.println("The bank's service fees for the month are: " + "$" + df.format((checksWrittenThisMonth * .10) + bankChargesBaseFee));
        } else if (checksWrittenThisMonth <= 39) {
            System.out.println("The bank's service fees for the month are: " + "$" + df.format((checksWrittenThisMonth * 0.08) + bankChargesBaseFee));
        } else if (checksWrittenThisMonth <= 59) {
            System.out.println("The bank's service fees for the month are: " + "$" + df.format((checksWrittenThisMonth * 0.06) + bankChargesBaseFee));
        } else {
            System.out.println("The bank's service fees for the month are: " + "$" + df.format((checksWrittenThisMonth * 0.04) + bankChargesBaseFee));
        }

    }
}
