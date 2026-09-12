public class smartCamera implements Powerable, WifiConnectable{
    public boolean isOn;
    public boolean isConnected;

    public smartCamera(){
        this.isOn=false;
    }
    public void turnOff(){
        if(isOn){
            isOn=false;
            System.out.println("The camera is turned off");
        }
        else{
            System.out.println("The camera is alreaddy turned off");
        }
    }
    public void turnOn(){
        if(!isOn){
            isOn=true;
            System.out.println("The camera is turned on");
        }
        else{
            System.out.println("The camera is alreaddy turned off");
        }
    }
}
