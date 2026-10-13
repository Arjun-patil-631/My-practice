
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {
        //String input = args[0];
        int input1, input2, result;
        Scanner scanner = new Scanner(System.in);
        //byte buffer[] = new byte[1024];
        Socket clientSocket = null;
        try {
            clientSocket = new Socket(InetAddress.getLocalHost(), 12345);
            //System.out.println("client Socket on"+clientsocket);
            OutputStream os = clientSocket.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            System.out.print("Enter first number: ");
            input1 = scanner.nextInt();
            dos.writeInt(input1);
            
            System.out.print("Enter second number: ");
            input2 = scanner.nextInt();            
            dos.writeInt(input2);
            
            DataInputStream dis=new DataInputStream(clientSocket.getInputStream());
            result=dis.readInt();
            System.out.println("The sum of given inputs: "+result);
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            if (clientSocket != null) {
                try {
                    clientSocket.close();
                    scanner.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
