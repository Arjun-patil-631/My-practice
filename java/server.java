import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        //byte buffer[]=new byte[1024];
        try {
            serverSocket = new ServerSocket(12345);
            System.out.println("INFO: Server started "+new java.util.Date());
            while(true){
            new ProcessThread(serverSocket.accept()).start();

            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }finally{
            if(serverSocket!=null)
            try {
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
