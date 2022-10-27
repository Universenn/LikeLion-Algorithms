package week4.day1027;

import java.util.HashMap;

public class ARacer {
    //1.HashMap memo에 Participant를 모두 넣을때 1로 초기화.
    //2.completion에 들어있는 이름을 key로 HashMap에 검색 합니다. 있으면 0으로 check
    //3.memo를 한바퀴 돌면서 1인 값을 찾습니다.
    //
    //Participant에 1명이 남습니다.
    //그러면 그 1명을 return


    private int size = 100000;

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> memo  = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key,1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];  // value 1
            memo.put(key,0);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1){
                return key;
            }

        }

        return answer;
    }
}
