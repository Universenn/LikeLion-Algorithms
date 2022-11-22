package week8.day1122;

public class Recursion {
    public static void print1to100(int n) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
        if (n>100) {
            return;
        }
        System.out.println(n);
        print1to100(n+1);
    }
    public static void main(String[] args) {
        print1to100(1);
    }
}
