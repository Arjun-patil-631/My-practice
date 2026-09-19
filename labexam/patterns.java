import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        System.out.println("pattern 1:");
        for (int i = 1; i <=N; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("pattern 2:");
        for(int i=N; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}