public class CryptoProcessor implements PaymentProcessor{

    private double networkFee;

    public CryptoProcessor(double networkFee){
        this.networkFee=networkFee;
    }

    public void processPayment(double amount){
        double totalAmount=networkFee+amount;
        System.out.println("Processing Crypto payment...");
        System.out.println("Original Amount: $" + amount);
        System.out.println("Network Fee: $" + networkFee);
        System.out.println("Total Amount: $" + totalAmount);

        printReceipt(totalAmount);
    }

    
}