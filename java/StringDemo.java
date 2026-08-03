/*
public class StringDemo{
    public static void main(String args[]){
        System.out.println("outcome of string buffer");
        StringBuffer message=new StringBuffer("Hello!!");
        System.out.println(message);
        StringBuffer greeting=message.append(" Srinivas");
        System.out.println(message);
        System.out.println(greeting);

        //without string buffer
        System.out.println("\noutcome of string");
        String message1="Hello!!";
        System.out.println(message1);
        String greeting1=message1.concat(" Srinivas");
        System.out.println(message1);
        System.out.println(greeting1);
    }
}
*/
//output
/*
outcome of string buffer
Hello!!
Hello!! Srinivas
Hello!! Srinivas

outcome of string
Hello!!
Hello!!
Hello!! Srinivas
*/
//write a progrm to display a menu till the user wish and track all the navigation and print it beofre exiting the applicaton

import java.util.Scanner;
public class StringDemo{
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
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Display contact");
        System.out.println("5. Exit");

        System.out.println("Enter your choice:");


    }
    static int getOption(){
        int choice=0;
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        return choice;
    }
}
