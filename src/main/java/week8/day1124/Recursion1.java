package week8.day1124;

public class Recursion1 {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int result = fib(8);
        System.out.println(result);
    }
}
