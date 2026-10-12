import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) throws IOException {
        try (
            Socket socket = new Socket("localhost", 12345);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String message;
            while ((message = console.readLine()) != null) {
                out.println(message);
                System.out.println(in.readLine());
            }
        }
    }
}