import java.io.*;
public class LNRDemo {
    public static void main(String[] args) throws Exception {
        LineNumberReader reader = new LineNumberReader(new FileReader("hello.java"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(reader.getLineNumber() + ": " + line);
        }
        reader.close();
    }
}