package week5.day1105.backjoon.num10926;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
//        int A = 385;
//        int B = 472;

        int C1 = (A*((B)%10));
        int C2 = (A*((B/10)%10));
        int C3 = (A*((B/100)%10));

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C1+(C2*10)+(C3*100));



    }
}
