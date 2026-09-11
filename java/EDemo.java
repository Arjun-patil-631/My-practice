
public class EDemo {
    public static void main(String[] args) {
        System.out.println("From the start of the main...");
        try {
            int values[] = {10, 20, 30, 40, 50};
            for (int i = 0; i <5; i++) {
                System.out.println("value at " + i + " is " + values[i]);
            }
            double numerator=10, denominator=0;
            double result=numerator/denominator;
            System.out.println("result: "+result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of range...");
        } catch (ArithmeticException ae){
            System.out.println("It goes to infinity...");
        }
        finally{
            System.out.println("This is always printed");
        }
        System.out.println("From the end of the main...");
    }
}
