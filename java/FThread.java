public class FThread extends Thread{
    private int input;

    public FThread(String name, int input){
        super(name);
        this.input=input;

    }

    private int findFactorial(int i){
        if(i==0 || i==1){
            return i;
        }
        else{
            return i*findFactorial(i-1);
        }
    }

    @Override
    public void run(){
        for(int i=1;i<=input; i++){
            System.out.println("Factorial of "+ i +" is "+ findFactorial(i));
        }
    }

}