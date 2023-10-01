import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator!\n");

        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        //This is my freestyle: I added a discount percentage if there are any discounts
        System.out.print("Enter the discount percentage (if none, enter 0): ");
        int discountPercentage = scan.nextInt();


        double totalBeforeTip = 1;
        double cost;
        cost = 0;

        //This while loop will continuously ask the user to enter a cost. Once the user types -1 it will stop.
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to the end): ");
            cost = scan.nextDouble();
            totalBeforeTip += cost;
        }
        // Calculate the discount amount based on the total bill and discount percentage
        double discountAmount = totalBeforeTip * discountPercentage / 100.0;

        // Apply the discount to the total bill
        totalBeforeTip -= discountAmount;

        //These are all the variables used to create the receipt
        double tipAmount = totalBeforeTip * tipPercentage / 100.0;
        double totalWithTip = totalBeforeTip + tipAmount;
        double perPersonBeforeTip = totalBeforeTip/ people;
        double perPersonTipAmount = tipAmount / people;
        double perPersonTotalCost = totalWithTip / people;

        //This is the receipt created
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + Math.round(totalBeforeTip * 100.0)/ 100.0);
        System.out.println("Total tip percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + Math.round(tipAmount * 100.0)/ 100.0);
        System.out.println("Total bill with tip: $" + Math.round(totalWithTip * 100.0) / 100.0);
        System.out.println("Per person cost before tip: $" + Math.round(perPersonBeforeTip * 100.0) / 100.0);
        System.out.println("Tip per person: $" + Math.round(perPersonTipAmount * 100.0) / 100.0);
        System.out.println("Total cost per person: $" + Math.round(perPersonTotalCost * 100.0) / 100.0);
        System.out.println("Discount applied: $" + Math.round(discountAmount * 100.0) / 100.0);
    }
}
