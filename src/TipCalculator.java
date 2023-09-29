import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator!\n");

        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        double totalBeforeTip = 0;
        double cost;
        cost = 0;

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to the end): ");
            cost = scan.nextDouble();
            totalBeforeTip += cost;
            people--;
        }
        double tipAmount = (totalBeforeTip * tipPercentage) / 100;
        double totalWithTip = totalBeforeTip + tipAmount;

        System.out.println("Total bill before tip: $" + totalBeforeTip);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + tipAmount);
        System.out.println("Total bill with tip: $" + totalWithTip);

        double perPersonBeforeTip = totalBeforeTip / people;
        double perPersonTipAmount = tipAmount / people;
        double perPersonTotalCost = totalWithTip / people;

        System.out.println("Per person cost before tip: $" + perPersonBeforeTip);
        System.out.println("Tip per person: $" + perPersonTipAmount);
        System.out.println("Total cost per person: $" + perPersonTotalCost);

    }
}
