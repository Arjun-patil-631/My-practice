public class DemoSecureTransaction{
    public static void main(String[] args) {

        WireTransfer transfer =new WireTransfer("Arjun", "Rahul", 5000);

        System.out.println("===== VALID SIGNATURE =====");
        transfer.processTransfer("VALID123");

        System.out.println();

        System.out.println("===== INVALID SIGNATURE =====");
        transfer.processTransfer("WRONG123");
    }

}