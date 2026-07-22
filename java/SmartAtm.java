import java.util.Scanner;

public class SmartAtm{
    public static void main(String args[]){
        //giving all the necessary details
        int fixedCode=1234, attempts=3;
        double Balance=50000;
        int pin, choice=0;

        //greeting the user
        System.out.println("Welcome to ATM");
        while(attempts!=0){
            System.out.println("Enter your pin");
            Scanner scanner=new Scanner(System.in);
            pin=scanner.nextInt();
            if(pin==fixedCode){
                while(true){
                        System.out.println("----Successfully loggined----\n\n");
                        System.out.println("1.Check Balance\n");
                        System.out.println("2.Deposit\n");
                        System.out.println("3.withdraw\n");
                        System.out.println("4.exit\n\n");
                        System.out.println("Enter your choice:");
                        choice=scanner.nextInt();
                        switch(choice){
                            case 1: System.out.println(Balance);
                                    break;
                            case 2: System.out.println("Enter the amount to deposit:");
                                    double DepositAmount=scanner.nextDouble();
                                    Balance+=DepositAmount;
                                    System.out.println("Amount deposited Successfully"+DepositAmount);
                                    break;
                            case 3: System.out.println("Enter the amount to withdraw: ");
                                    double WithdrawAmount=scanner.nextDouble();
                                    Balance-=WithdrawAmount;
                                    System.out.println("Amount Withdrawn Successfully"+WithdrawAmount);
                                    break;
                            case 4: System.out.println("Exiting...\nThank you for using ATM");
                                    return;
                            default:System.out.println("Please enter valid option...\n");
                        }
                    }

            }
            else{
                System.out.println("Invalid pin!!");
                attempts-=1;
                System.out.println("Attempts left:"+attempts);
            }
        }
        
    }
}