public class DemoPaymentGateway{
    public static void main(String[] args) {

        // Validate currency using static method
        String currency = "USD";

        if (PaymentProcessor.validateCurrency(currency)) {
            System.out.println("Currency " + currency + " is valid.");
        } else {
            System.out.println("Invalid currency.");
        }

        System.out.println();

        // Credit Card
        PaymentProcessor creditCard = new CreditCardProcessor();
        creditCard.processPayment(100);

        System.out.println();

        // Crypto with $5 network fee
        PaymentProcessor crypto = new CryptoProcessor(5);
        crypto.processPayment(100);
    }
}