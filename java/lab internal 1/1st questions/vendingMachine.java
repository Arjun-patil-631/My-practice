import java.util.Scanner;

public class vendingMachine{
    static Scanner sc = new Scanner(System.in);
    static void display(){
        System.out.println("Smart vending Machine");
        System.out.println("'C' - rs10 coffee");
        System.out.println("'T' - rs15 tea");
        System.out.println("'J' - rs20 juice");
        System.out.println("'W' - rs5 water");
        System.out.println("'E' - EXIT");
    }
    static char getChoice(){
        return Character.toUpperCase(sc.next().charAt(0));
    }
    static void addSugar(){
        System.out.println("Enter 1 for sugar or 2 for no sugar:");
        int sugarChoice = sc.nextInt();
        switch (sugarChoice) {
            case 1 ->
                System.out.println("Sugar added");
                
            case 2 ->
                System.out.println("No sugar added");
            default ->
                System.out.println("Invalid sugar choice");
        }
    }
    public static void main(String[] args) {
        int amount=0;
        while (true) { 
            display();
            System.out.println("Enter  your choice");
            char choice = getChoice();
            switch (choice) {
                case 'C' -> {
                    System.out.println("Coffee is added");
                    addSugar();
                    amount+=10;
                }
                case 'T' -> {
                    System.out.println("Tea is added");
                    addSugar();
                    amount+=15;
                }
                case 'J' -> {
                    System.out.println("Juice is added");
                    amount+=20;
                }
                case 'W' -> {
                    System.out.println("Water is added");
                    amount+=5;
                }
                case 'E' -> {
                    finalAmount(amount);
                    return;
                }
                default ->
                    System.out.println("Invalid choice");
            }
        }
    }
    static void finalAmount(int amount){
        System.out.println("The final amount is: " + amount);
        System.out.print(amount);
    }
}