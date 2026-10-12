
import java.util.Random;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        Random random=new Random();
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                sleep(random.nextInt(1000)*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}