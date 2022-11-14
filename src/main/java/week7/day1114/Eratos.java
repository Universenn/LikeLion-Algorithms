package week7.day1114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N-1];
        // 2~50 나열
        for (int i = 0; i < arr.length; i++) arr[i] = i+2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=2&&arr[i]%2==0) arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
