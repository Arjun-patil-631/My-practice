import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DISDemo {
    public static void main(String args[]){
        DataInputStream dis=null;
        int englishmarks;
        int mathmarks;
        int sciencemarks;
        double percentage;
        try{
            dis=new DataInputStream(new FileInputStream("primdata.dat"));
            englishmarks=dis.readInt();
            mathmarks=dis.readInt();
            sciencemarks=dis.readInt();
            percentage=dis.readDouble();
            System.out.println("English Marks:\t"+englishmarks);
            System.out.println("Maths Marks:\t"+mathmarks);
            System.out.println("Science Marks:\t"+sciencemarks);
            System.out.println("Percentage:\t"+percentage);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
