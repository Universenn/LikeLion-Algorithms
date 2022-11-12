package week6.day1112.programmers;

import java.util.Arrays;

public class Programmers437175 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands[0].length];
        int[] arr1 = {};
        for (int i = 0; i < commands[0].length; i++) {
            arr1 = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr1);
            answer[i] = arr1[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Programmers437175 pg = new Programmers437175();
        System.out.println(Arrays.toString(pg.solution(arr,commands)));

    }
}
