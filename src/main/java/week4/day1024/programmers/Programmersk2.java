package week4.day1024.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Programmersk2 {
    public static void main(String[] args) {
        Programmersk2 pg2 = new Programmersk2();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[]result = pg2.solution(arr, commands);
        System.out.println(Arrays.toString(result));

    }

    private int[] arr = {};

    public int[] solution(int[] array, int[][] commands) {
        this.arr = array;
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }
    public int getKthNum(int[] command){
        int frIdx = command[0];
        int toIdx = command[1];
        int num = command[2];

        int result = 0;
        // 우선순위 선입선출, 알아서 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < num; i++) {
            result = pq.poll();
        }
        return result;
    }

}
