import java.util.Scanner;
public class Dem{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.out.in);
        String mail;
        mail= Scanner.nextLine();
        if(mail.contain("@")){
            if(mail.endWith(".com"))
                System.out.println("true");
        }
    }
}