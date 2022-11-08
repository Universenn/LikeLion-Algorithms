package week6.day1108.CodeUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int find = sc.nextInt();
        if (list.contains(find)) {
            System.out.println(list.indexOf(find)+1);
        }else System.out.println(-1);
    }
}
