public class SmartCamera implements Powerable, WifiConnectable{
    private  boolean isOn;
    private  boolean isConnected;
    private  String network;

    public SmartCamera(){
        this.isOn=false;
        this.isConnected=false;
    }

    public void turnOff(){
        if(isConnected && isOn){
            network="";
            isOn=false;
            System.out.println("Camera Disconnected..");
            System.out.println("The camera is turned off");
        }
        else if(isOn){
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

    public void connectToNetwork(String ssid){
        if(!isOn){
            System.out.println("Error:  The camera should be turned ON to connect to network");
            
        }
        else if(isOn && isConnected){
            System.out.println("The camera is already connected to Network");
        }
        else{
            isConnected=true;
            network=ssid;
            System.out.println("The camera is now connected to the wifi: "+ssid);

        }

    }

    public void disconnect(){
        if(!isOn && !isConnected){
            System.out.println("  Error: The camera is already off and disconnected from network");
        }
        else{
            isConnected=false;
            network="";
            System.out.println("The camera is disconnected successfully");
        }
    }

    public void displayStatus(){
        System.out.println("\nShowing the Smart Camera status");
        System.out.println("Smart Camera Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Wi-Fi: " + (isConnected ? "Connected to " + network : "Disconnected"));
    }
}
