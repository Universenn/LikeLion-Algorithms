package week6.day1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers12910 {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        List<Integer> a1 = new ArrayList<>();

        for (int i : arr) {
            if (i%divisor==0){
                a1.add(i);
            }
        }
        System.out.println(a1);


        int[] arr2 = {2, 36, 1, 3};
        Arrays.sort(arr2);

        List<Integer> a2 = new ArrayList<>();
        int divisor2 = 1;

        for (int i : arr2) {
            if (i%divisor2==0){
                a2.add(i);
            }
        }

        System.out.println(a2);
    }
}
