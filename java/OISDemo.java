import java.io.*;

public class OISDemo {
    public static void main(String args[]){
        ObjectInputStream is =null;
        try {
            clock c= null;
            is=new ObjectInputStream(new FileInputStream("Javadata.dat"));
            c=(clock) is.readObject();
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
