public class ThreadDemo{
    public static void main(String[] args) {
        System.out.println("Main thread started:");
        Thread t1=new MTThread("Table thread",12);
        Thread t2=new FThread("Factorial thread", 5);
        
        Thread.currentThread().setPriority(1);
        t1.setPriority(5);
        t2.setPriority(9);
        t1.start();
        t2.start();
        System.out.println("Main thread Ended");
        
    }
}