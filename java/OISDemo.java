import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISDemo {
    public static void main(String args[]){
        ObjectInputStream is =null;
        try {
            Clock c= null;
            is=new ObjectInputStream(new FileInputStream("Javadata.dat"));
            c=(Clock) is.readObject();
            c.showTime();
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if (is !=null){
                try{
                    is.close();
                }catch(IOException ie){
                    ie.printStackTrace();
                }
            }
        }

    }
}
