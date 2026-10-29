import java.util.*;
public class time{
    public static void main(String[] args) {
        Set<String> names=new TreeSet<String>();
        long StartTime=System.currentTimeMillis();
        names.add("Srinivas");
        names.add("Ram mohan");
        names.add("Praveen");
        names.add("Bala chary");
        long EndTime=System.currentTimeMillis();
        System.out.println("Time taken to add elements in TreeSet:\t"+(EndTime-StartTime)+"ms");
    }
}