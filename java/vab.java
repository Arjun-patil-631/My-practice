class vab{
    public static void main(String args[]){
        float x=65.54;
        System.out.println("The value of x is:"+x);
    }
}
//the above code will give error because the value of x is double 
//to fix the error we can use the below code


public class vab{
    public static void main(String args[]){
        float x=65.54f;
        System.out.println("The value of x is:"+x);
    }
}
//for explanation: In Java, floating-point literals are treated as double by default.

//x=65.54
//we can write it as x=6.554e1  where e1 means 10^1
public class vab{
    public static void main(String args[]){
        float x=6.554e1f;
        System.out.println("The value of x is:"+x);
    }
}
