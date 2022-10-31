package week5.day1031;

import java.util.Arrays;

public class Programmers {

//            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//            [1,2,3,4,5]	[1]
//            [1,3,2,4,2]	[1,2,3]

//            시험은 최대 10,000 문제로 구성되어있습니다.
//            문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//            가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] arr1 = {1, 2, 3, 4, 5}; // 5개씩 반복
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8개씩 반복
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개씩 반복


        int[] scores = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i]) { scores[0]++;}
            if (answers[i] == arr2[i]) { scores[1]++;}
            if (answers[i] == arr3[i]) { scores[2]++;}
        }
        System.out.println(Arrays.toString(scores));

        return answer;
    }

    public static void main(String[] args) {
        Programmers pg = new Programmers();
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};
        pg.solution(answer1);
        pg.solution(answer2);
    }
}
