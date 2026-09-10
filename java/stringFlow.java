import java.util.Scanner;
public class stringFlow{
    public static void main(String args[]){
        int choice;
        StringBuffer MenuFlowString = new StringBuffer("Menu Flow:\n");
        Scanner scanner = new Scanner(System.in);
        do{
        displayMenu();
        choice=getOption();
        switch(choice){
            case 1:
                System.out.println("Enter two numbers to add: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int sum = a + b;
                System.out.println("Sum: " + sum);
                MenuFlowString.append("Addition performed Result is " + sum + "->\n");
                break;
            case 2:
                System.out.println("Enter two numbers to subtract: ");
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                int difference = c - d;
                System.out.println("Difference: " + difference);
                MenuFlowString.append("Subtraction performed Result is " + difference + "->\n");
                break;
            case 3:
                System.out.println("Enter two numbers to multiply: ");
                int e = scanner.nextInt();
                int f = scanner.nextInt();
                int product = e * f;
                System.out.println("Product: " + product);
                MenuFlowString.append("Multiplication performed Result is " + product + "->\n");
                break;
            case 4:
                System.out.println("Exiting...");
                MenuFlowString.append("Exited from menu ->\n");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                MenuFlowString.append("Invalid choice made ->\n");
                break;
        }
        }while(choice!=4);
        System.out.println(MenuFlowString);
    }
    static void displayMenu(){
        System.out.println("-----------------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Exit");

        System.out.println("Enter your choice:");


    }
    static int getOption(){
        int choice=0;
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        return choice;
    }
}