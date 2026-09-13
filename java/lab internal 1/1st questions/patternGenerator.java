
import java.util.Scanner;

public class patternGenerator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N: ");
        int N=sc.nextInt();

        System.out.print("1st pattern: \n");
        for(int i=N; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n2nd pattern: \n");
        for (int i = 1; i <=N; i++) {
            for(int j=1; j<= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}