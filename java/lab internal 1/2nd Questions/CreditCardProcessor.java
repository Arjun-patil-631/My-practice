public class CreditCardProcessor implements PaymentProcessor{
    
    public void processPayment(double amount){
        System.out.println("Processing payment with credit card...");
        System.out.println("Amount $:"+amount);
        printReceipt(amount);
    }
}