package week5.day1102.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberAra {


    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();


        for (int i = 2; i <= 50; i++) {
                arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2==0 && arr.get(i) > 2) {
                arr.remove(i);
            }
        }
        System.out.println(arr.size());
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 3 == 0 && arr.get(i) > 3) {
                arr.remove(i);
            }
        }
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
