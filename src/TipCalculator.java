import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator!\n");

        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        double totalBeforeTip = 0;

        while (people != 0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to the end): ");
            double cost = scan.nextDouble();
            if (cost != -1) {
                totalBeforeTip += cost;
            }
            people--;
        }
        System.out.println("The total before tips is: $" + totalBeforeTip);
        System.out.print("Total percentage: " + tip);

    }
}
