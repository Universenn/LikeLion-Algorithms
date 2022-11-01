package week5.day1101.programmers;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    boolean isPrime(int num, StatementStrategy stmt) {

        for (int i = 2; stmt.compare(i,num); i++) {
            System.out.print(i+", ");
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        boolean prime = tcp.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a < b;
            }
        });
        System.out.println(prime);

        System.out.println(tcp.isPrime(13,(a,b)-> a<b));
        System.out.println(tcp.isPrime(19,(a,b)-> a<b/2));
        System.out.println(tcp.isPrime(17,(a,b)-> a*a<b));
    }
}
