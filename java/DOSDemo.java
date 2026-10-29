import java.io.*;

public class DOSDemo {
    public static void main(String args[]){
        DataOutputStream dos=null;
        int englishmarks=78;
        int mathmarks=98;
        int sciencemarks=89;
        double percentage=(englishmarks+mathmarks+sciencemarks)/3.0;
        try{
            dos=new DataOutputStream(new FileOutputStream("primdata.dat"));
            dos.writeInt(englishmarks);
            dos.writeInt(mathmarks);
            dos.writeInt(sciencemarks);
            dos.writeDouble(percentage);

            dos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}