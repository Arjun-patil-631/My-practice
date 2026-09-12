import java.util.Scanner;

public class ClassifierAndAnalyser{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;
        int num, sum,rem,even,odd;
        do { 
            System.out.println("Enter the number: ");
            num=sc.nextInt();
            sum=0;
            rem=0;
            even=0;
            odd=0;
            while(num>0){
                rem=num%10;
                if(rem%2==0){
                    even++;
                }
                else{
                    odd++;
                }
                sum+=rem;
                num/=10;
            }
            boolean prime=true;
            if(sum < 2){
                prime=false;
            }
            for (int i = 2; i < sum/2; i++) {
                if(sum % i == 0){
                    prime=false;
                }
            }
            System.out.println("Sum of digits: " + sum);
            System.out.println("Even digits: " + even);
            System.out.println("Odd digits: " + odd);
            System.out.println("Is sum prime? " + prime);

            System.out.println("\nDo u want to continue (y/n): ");
            choice=sc.next().charAt(0);
        } while (choice=='y'|| choice=='Y');
        System.out.println("Exiting the Number Classifier and Digit Analyser...");
        System.out.println("Thank you for using.. :)");

        sc.close();
    }
}