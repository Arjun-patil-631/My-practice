public class SmartThermostat implements Powerable, WifiConnectable{
    private boolean isOn;
    private boolean isConnected;
    private String network;

    public SmartThermostat(){
        this.isOn=false;
        this.isConnected=false;
    }
    public void turnOff(){
        if(isConnected && isOn){
            System.out.println("Thermostat Disconnected..");
            System.out.println("The Thermostat is turned off");
        }
        else if(isOn){
            isOn=false;
            System.out.println("The Thermostat is turned off");
        }
        else{
            System.out.println("The Thermostat is alreaddy turned off");
        }
    }
    public void turnOn(){
        if(!isOn){
            isOn=true;
            System.out.println("The Thermostat is turned on");
        }
        else{
            System.out.println("The Thermostat is alreaddy turned off");
        }
    }
    public void connectToNetwork(String ssid){
        if(!isOn){
            System.out.println("Error:  The thermostat should be turned ON to connect to network");
            
        }
        else if(isOn && isConnected){
            System.out.println("The thermostat is already connected to Network");
        }
        else{
            isConnected=true;
            network=ssid;
            System.out.println("The thermostat is now connected to the wifi: "+ssid);

        }

    }

    public void disconnect(){
        if(!isOn && !isConnected){
            System.out.println("  Error: The thermostat is already off and disconnected from network");
        }
        else{
            isConnected=false;
            network="";
            System.out.println("The thermostat is disconnected successfully");
        }
    }

    public void displayStatus(){
        System.out.println("\nShowing the Smart Thermostat status");
        System.out.println("Smart Thermostat Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Wi-Fi: " + (isConnected ? "Connected to " + network : "Disconnected"));
    }
}