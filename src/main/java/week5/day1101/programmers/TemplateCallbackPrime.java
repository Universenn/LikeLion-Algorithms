package week5.day1101.programmers;

public class TemplateCallbackPrime {
    boolean someOperation(int a, int b) {
        return a < b;
    }
    boolean isPrime(int num) {

        for (int i = 2; someOperation(i,num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean prime = tcp.isPrime(12);
        System.out.println(prime);
    }
}
