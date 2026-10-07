import java.util.*;
public class MapDemo{
    public static void main(String[] args) {
        Map<String,Person> sdata=new HashMap<String,Person>();
        sdata.put("25N81A6631",new Person("Arjun", "CSE-AIML","Arjun@gamil.com","8247706241"));
        sdata.put("25N81A6641",new Person("moin", "CSE-AIML","moin@gamil.com","8634134348"));

        Set<String> rollNos =sdata.keySet();
        Iterator<String> iterator =rollNos.iterator();
        String rollNo;
        Person studentDetails;
        while(iterator.hasNext()){
            rollNo=iterator.next();
            studentDetails=sdata.get(rollNo);
            System.out.println(rollNo+"\t:\t"+studentDetails.toString());
        }

    }
}