import java.util.Scanner;

public class Atm{
    public static void main(String args[]){
        //giving all the necessary details
        int FixedCode=1234, MAX_ATTEMPTS=3;
        double Balance=50000;
        int Pin, Choice=0;

        //greeting the user
        System.out.println("Welcome to ATM");
        while(MAX_ATTEMPTS!=0){
            System.out.println("Enter your Pin");
            Scanner scanner=new Scanner(System.in);
            Pin=scanner.nextInt();
            if(Pin==FixedCode){
                System.out.println("----Successfully loggined----\n\n");
                while(true){
                        System.out.println(" \n\n______________________________");
                        System.out.println("|----DISPLAYING MAIN MENU-----|");
                        System.out.println("|_____________________________|");
                        System.out.println("|   1.Check Balance           |");
                        System.out.println("|   2.Deposit                 |");
                        System.out.println("|   3.withdraw                |");
                        System.out.println("|   4.exit                    |");
                        System.out.println("|_____________________________|");
                        System.out.println("Enter your Choice:");
                        Choice=scanner.nextInt();
                        switch(Choice){
                            case 1: System.out.println("Your current Balance is:");
                                    System.out.printf("%.2f",Balance);
                                    break;
                            case 2: System.out.println("Enter the amount to deposit:");
                                    double DepositAmount=scanner.nextDouble();
                                    Balance+=DepositAmount;
                                    System.out.println("Amount deposited Successfully");
                                    break;
                            case 3: System.out.println("Enter the amount to withdraw: ");
                                    double WithdrawAmount=scanner.nextDouble();
                                    if(WithdrawAmount>Balance){
                                        System.out.println("Insufficient Account Balance!!\n");
                                        System.out.println("Navigating to Main Menu");
                                    }else{
                                        Balance-=WithdrawAmount;
                                        System.out.println("Amount Withdrawn Successfully"+WithdrawAmount);
                                    }
                                    break;
                            case 4: System.out.println("Exiting...\nThank you for using ATM");
                                    return;
                            default:System.out.println("Please enter valid option...\n");
                        }
                    }

            }
            else{
                System.out.println("Invalid Pin!!");
                MAX_ATTEMPTS-=1;
                System.out.println("MAX ATTEMPTS left:"+MAX_ATTEMPTS);
            }
        }
        
    }
}