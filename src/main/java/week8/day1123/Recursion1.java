package week8.day1123;

public class Recursion1 {
    public static void print1toN(int n) {
        if (n<=0) return;
        System.out.print("*");
        print1toN(n-1);
    }

    public static String printN(int num, String s) {
        if (num==0) return "";
        return s+printN(num-1,s);
    }

    private static String printNum2(int num) {
        if(num == 0) return "";
        return "*" + printNum2(num - 1);
    }
    public static void main(String[] args) {
        print1toN(3);
        System.out.println();
        System.out.println(printN(3,"*"));
        System.out.println(printNum2(3));
    }
}
