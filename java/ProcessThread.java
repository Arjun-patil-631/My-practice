
import java.io.*;
import java.net.*;

public class ProcessThread extends Thread{
    private Socket socket;
    public ProcessThread(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try {
            InputStream is=socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            int i=dis.readInt();
            int j=dis.readInt();
            int sum=i+j;
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            dos.writeInt(sum);
            dos.close();
            dis.close();
            socket.close();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}