
import java.io.*;
import java.net.*;

public class ProcessThread extends Thread {

    private final Socket socket;

    public ProcessThread(Socket socket) {
        super("ClientHandler-" + socket.getRemoteSocketAddress());
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                Socket clientSocket = socket; BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())); 
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
            ){
            System.out.println("Connected successfully." 
                    + " handled by " + Thread.currentThread().getName());
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received from " + clientSocket.getRemoteSocketAddress()
                        + ": " + inputLine);
                out.println("Echo: " + inputLine);
            }
        } catch (IOException e) {
            System.err.println("Error handling client " + socket.getRemoteSocketAddress()
                    + ": " + e.getMessage());
        }
    }
}
