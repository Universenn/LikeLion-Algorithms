package week6.day1109;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) minIdx = i;
        }

        int tmp = 0;
        tmp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx]  = arr[0];

        System.out.println(Arrays.toString(arr));


        minIdx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) minIdx = i;
        }

        tmp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx]  = arr[1];

        System.out.println(Arrays.toString(arr));

    }


}
