import java.util.*;
public class LDemo{
    public static void main(String[] args) {
        Set<String> names =new HashSet<String>();
        names.add("Srinivas");
        names.add("Ram mohan");
        names.add("Praveen");
        names.add("Bala chary");
        Set<String> sortedNames=new TreeSet<>(names);

        Iterator<String> iterator =sortedNames.iterator();
        String name;
        while(iterator)
        System.out.println(iterator);
    }
}