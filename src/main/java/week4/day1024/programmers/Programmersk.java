package week4.day1024.programmers;

import java.util.Arrays;

public class Programmersk {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[] arr1 = Arrays.copyOfRange(arr, 2-1, 5);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[2]);

// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
// 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
// array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
// 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
// 2에서 나온 배열의 3번째 숫자는 5입니다.

        int[][] commend = {{2,5,3}, {4,4,1}, {1,7,3}, {1,5,3}};

        Programmersk test = new Programmersk();
        int[] result = test.solution(arr, commend);
        System.out.println(Arrays.toString(result));
        System.out.println(commend.length);


    }


    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] slicedArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2]-1];
        }
        return answer;
    }
}
