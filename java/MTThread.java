public class MTThread extends Thread{
    private String name;
    private int table;

    public MTThread(String name,int table){
        super(name);
        this.table=table;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(table + " * " + i +" = "+(table*i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}