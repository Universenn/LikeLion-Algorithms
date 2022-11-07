package week6.day1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers12910 {
    public int[] solution(int[] arr, int divisor) {
        // 오름차순 정렬
        Arrays.sort(arr);

        // List 생성
        List<Integer> list = new ArrayList<>();

        // arr 배열중 divisor 로 나누어 떨어지는 수 add
        for (int i : arr) {
            if (i%divisor==0){
                list.add(i);
            }
        }
        System.out.println(list);

        // 값이 없다면 -1 추가
        if (list.size() == 0) return new int[]{-1};

        // List Array 로 바꾸기
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
          result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3, 2, 6};
        int divisor1 = 5;
        int divisor2 = 1;
        int divisor3 = 10;
        Programmers12910 pg = new Programmers12910();
        pg.solution(arr1, divisor1);
        pg.solution(arr2, divisor2);
        pg.solution(arr3, divisor3);

    }
}
