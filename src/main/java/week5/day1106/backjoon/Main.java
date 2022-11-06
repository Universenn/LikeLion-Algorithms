package week5.day1106.backjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int y1 = y-45;

        if (y1<0) {
            y1 = 60 + y1;
            x = x -1;
        }
        if (x<0) {
            x = 24 + x;
        }
        System.out.println(x + " " + y1);

    }
}
