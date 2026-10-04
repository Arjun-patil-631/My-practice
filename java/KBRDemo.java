import java.io.*;
public class KBRDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float result=Float.parseFloat(reader.readLine())+Float.parseFloat(reader.readLine());
        System.out.println("Result: " + result);
    }
}