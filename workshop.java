//The Online Shopping Cart
//A shopping app stores product prices in an array when a customer adds items.
//Use a loop to calculate the total cart value.
//Apply a discount of 10% if the total exceeds 5000.
//Add a delivery charge of 100 if the total after discount is less than 2000.
//Display the final payable amount.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        System.out.println("Enter prices of items:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextDouble();

        double total = 0;
        for (double p : prices) total += p;

        if (total > 5000) total *= 0.9;
        if (total < 2000) total += 100;

        System.out.println("Final payable amount: " + total);
    }
}