package week6.day1109;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int minIdx = 0;
        int temp = 0;


        for (int i = 0; i < arr.length; i++) {
            minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println(Arrays.toString(arr));
        }

    }


}
