public class WireTransfer implements SecureTransaction{
    private String sender;
    private String receiver;
    private double amount;

    public WireTransfer(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public boolean verifyDigitalSignature(String signature) {

        if (signature.equals("VALID123")) {
            System.out.println("Digital signature verified.");
            return true;
        } else {
            System.out.println("Digital signature verification failed.");
            return false;
        }
    }

    public void execute() {
        System.out.println("Executing wire transfer...");
        System.out.println("From: " + sender);
        System.out.println("To: " + receiver);
        System.out.println("Amount: $" + amount);
    }

    // Secure execution
    public void processTransfer(String signature) {

        if (verifyDigitalSignature(signature)) {
            execute();
        } 
        else{
            System.out.println("Transfer aborted.");
        }
    }

}