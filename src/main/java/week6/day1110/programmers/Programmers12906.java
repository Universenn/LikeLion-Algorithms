package week6.day1110.programmers;

import java.util.*;

public class Programmers12906 {
    public int[] solution(int[] arr) {

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            // list의 마지막 번째와 arr의 현재 값 비교
            if(answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        Programmers12906 pg = new Programmers12906();

        System.out.println(Arrays.toString(pg.solution(arr)));
    }
}
