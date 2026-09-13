public interface SecureTransaction extends Transaction{

    public boolean verifyDigitalSignature(String signature);
}