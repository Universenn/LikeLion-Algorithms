package week7.day1114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }
        System.out.println(Arrays.toString(arr));

    }
}
