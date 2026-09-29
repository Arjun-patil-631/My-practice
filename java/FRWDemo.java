
import java.io.*;

public class FRWDemo {

    public static void main(String[] args) {
        int data;
        try (FileReader fr = new FileReader("hello.java"); 
                FileWriter fw = new FileWriter("hello_copy.java")) {
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
