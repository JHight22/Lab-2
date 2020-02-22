
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestScoresAndGrade {

    public static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your first test score");

        double firstTestScore = keyboard.nextDouble();

        System.out.println("Please enter your second test score");

        double secondTestScore = keyboard.nextDouble();

        System.out.println("Please enter your third test score");

        double thirdTestScore = keyboard.nextDouble();

        double averageTestScore = (firstTestScore + secondTestScore + thirdTestScore) / 3;

        System.out.println("The average of your test scores is: " + df.format(averageTestScore));

        if (averageTestScore >= 90) {
            System.out.println("Your letter grade is an A");
        } else if (averageTestScore >= 80) {
            System.out.println("Your letter grade is a B");
        } else if (averageTestScore >= 70) {
            System.out.println("Your letter grade is a C");
        } else if (averageTestScore >= 60) {
            System.out.println("Your letter grade is a D");
        } else {
            System.out.println("Your letter grade is an F");
        }

    }
}
