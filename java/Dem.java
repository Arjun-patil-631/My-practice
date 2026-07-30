import java.util.Scanner;
public class Dem{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String mail;
        System.out.println("Enter the mail id: ");
        mail= scanner.nextLine();
        if(mail.contains("@")){
            int index=mail.indexOf("@");
            if(mail.endsWith(".com") && index!=0 && index<(mail.length())-5)
                    System.out.println("The given mail is valid");
            else{
                System.out.println("The given mail is invallid!!");
            }
        }
        else{
            System.out.println("The given mail is invallid!!");
        }
    }
}