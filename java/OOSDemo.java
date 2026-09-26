import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String args[]){
        ObjectOutputStream os =null;
        int data;
        try {
            Clock c= new Clock();
            c.setTime(14,53,55);
            os=new ObjectOutputStream(new FileOutputStream("Javadata.dat"));
            os.writeObject(c);
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }finally {
            if (os !=null){
                try{
                    os.close();
                }catch(IOException ie){
                    ie.printStackTrace();
                }
            }
        }

    }
}
