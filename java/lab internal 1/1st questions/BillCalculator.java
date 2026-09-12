/*
The Dynamic Bill Calculator
•	Problem Statement: Write a program that takes a customer's electricity units consumed as input and calculates the total bill amount till the uses wish, based on the following tiered tariff rates:
o	First 100 units: $1.20 per unit
o	Next 200 units (101 to 300): $2.00 per unit
o	Above 300 units: $3.00 per unit
An additional surcharge of 5% is added to the total bill if the total amount exceeds $500.
 */

import java.util.Scanner;

public class BillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill;
        char choice;
        do {
            System.out.print("Enter units: ");
            int units = sc.nextInt();
            if (units <= 100) {
                bill = units * 1.20;
            } else if (units <= 300) {
                bill = (100 * 1.20) + ((units - 100) * 2.00);
            } else {
                bill = (100 * 1.20) + (200 * 2.00) + ((units - 300) * 3.00);
            }

            if (bill > 500) {
                bill = bill + (bill * 0.05);
            }

            System.out.println("Total Bill Amount: $" + bill);
            System.out.println("Do u want to calculate another bill (y/n):");
            choice=sc.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');
        System.out.println("Exiting the Dynamic Bill Calculator");
        sc.close();
    }
}
