package week5.day1101.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberAra {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= 50; i++) {
            if (i % 2 != 0 || i == 2) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
