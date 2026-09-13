public class DemoSmartHome{
    public static void main(String[] args) {

        //Smart Camera
        SmartCamera camera = new SmartCamera();

        // Trying Wi-Fi while device is OFF
        camera.connectToNetwork("Home_WiFi");

        camera.turnOn();
        camera.connectToNetwork("Home_WiFi");
        camera.displayStatus();

        System.out.println();

        //Smart thermostat
        SmartThermostat thermostat = new SmartThermostat();

        thermostat.turnOn();
        thermostat.connectToNetwork("Home_WiFi");
        thermostat.displayStatus();

        thermostat.disconnect();
        thermostat.turnOff();
    }
}