public interface PaymentProcessor{

    public void processPayment(double amount);

    //default method
    public default void printReceipt(double amount){
        System.out.println("----- PAYMENT RECEIPT -----");
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful.");
        System.out.println("---------------------------");
    }

    //static method
    public static boolean validateCurrency(String currency){
        return currency.equalsIgnoreCase("USD")
            || currency.equalsIgnoreCase("EUR")
            || currency.equalsIgnoreCase("INR");

    }
    
}