package week5.day1101.programmers;

public class PrimeNumber {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    boolean isPrime(int n){
        boolean prime = (n % 2 != 0 || n % 3 != 0);
        if (prime) {
            System.out.printf("%d 는 소수가 입니다. \n", n);
        }

        return prime;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();

        System.out.println(pn.isPrime(23));

        int k = 13;
        System.out.println(k%2);
        System.out.println(k%3);
        if (k % 2 == 0 || k % 3 == 0) {}
        else System.out.printf("%d 는 소수가 입니다. \n", k);

    }
}
