package groceries;

import java.util.Scanner;

public class groceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for coupon amount
        System.out.print("Enter the coupon amount as a decimal (example, .10): ");
        double couponAmount = scanner.nextDouble();

        // Ensure coupon amount is between 0 and 1
        if (couponAmount <= 0 || couponAmount > 1) {
            couponAmount = 0.10; // default to 10% if invalid value is entered
        }

        // Prompt user for grocery bills for weeks 1-4
        double totalGroceryBill = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter the grocery bill for week " + i + ": $");
            double weeklyBill = scanner.nextDouble();
            totalGroceryBill += weeklyBill;
        }

        // Calculate monthly and weekly averages without coupon
        double monthlyTotalWithoutCoupon = totalGroceryBill;
        double weeklyAverageWithoutCoupon = totalGroceryBill / 4;

        // Calculate monthly and weekly averages with coupon
        double totalWithCoupon = totalGroceryBill * (1 - couponAmount);
        double monthlyTotalWithCoupon = totalWithCoupon;
        double weeklyAverageWithCoupon = totalWithCoupon / 4;

        // Display results
        System.out.println("\nMonthly total without coupon: $" + monthlyTotalWithoutCoupon);
        System.out.println("Weekly average without coupon: $" + weeklyAverageWithoutCoupon);
        System.out.println("\nMonthly total with coupon: $" + monthlyTotalWithCoupon);
        System.out.println("Weekly average with coupon: $" + weeklyAverageWithCoupon);

        scanner.close();
    }
}
