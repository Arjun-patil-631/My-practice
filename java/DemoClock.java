public class DemoClock{
    public static void main(String[] args){
        System.out.println("checking the constructor");
        clock c=new clock();
        c.showTime();
        System.out.println("\nchecking the  parametarized constructor");
        clock d=new clock(12,12,13);
        c.showTime();
        System.out.println("\nchecking the single parameter constructor");
        clock e =new clock(10);
        c.showTime();
        System.out.println("checking if the clock goes beyond 24 hrs");
        clock f=new clock(25,32,21);
        c.showTime();
    }
}

