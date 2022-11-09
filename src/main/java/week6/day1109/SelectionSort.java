package week6.day1109;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] arr, StatementStrategy stmt){
        int maxIdx = 0;
        int temp = 0;


        for (int i = 0; i < arr.length; i++) {
            maxIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[maxIdx], arr[j])) maxIdx = j;
            }
            temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int maxIdx = 0;
        int temp = 0;

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr, (a, b) -> a < b);

    }


}
