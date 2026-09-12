
import java.util.Scanner;

public class pinAuthenticator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        final int PIN=1234;
        int attempts=3;
        int pin_entered;

        System.out.println("Welcome to ATM ");
        while(attempts>0){
            System.out.println("Enter your pin: ");
            pin_entered=sc.nextInt();

            if(pin_entered == PIN){
                System.out.println("Access Granted.");
                return;
            }else{
                System.out.println("The password is invalid..");
                attempts--;
                if(attempts>0){
                    System.out.println("The remaining attempts left: " +attempts);
                }
                else{
                    System.out.println("Account Locked due to too many failed attempts");
                }
            }
        }
        System.out.println("Exiting..");
    }
}