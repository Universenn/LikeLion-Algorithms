package week4.day1027;

import java.util.HashMap;

public class ARacer {
    //1.HashMap memo에 Participant를 모두 넣을때 1로 초기화.
    //2.completion에 들어있는 이름을 key로 HashMap에 검색 합니다. 있으면 0으로 check
    //3.memo를 한바퀴 돌면서 1인 값을 찾습니다.
    //
    //Participant에 1명이 남습니다.
    //그러면 그 1명을 return
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> memo  = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            // null 포인트가 나오기 때문에 바로 put을 할 수가 없다.
            // key값이 null 이면 0dmf 넣어준다.?
            if (!memo.containsKey(key)){
                memo.put(key,0);
            }
            memo.put(key,memo.get(key) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];  // value 1
//            memo.put(key,0);
            // 하나를 빼준다.
            memo.put(key,memo.get(key)-1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1){
                return key;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        ARacer aRacer = new ARacer();
        String answer = aRacer.solution(participant, completion);
        System.out.println(answer);
    }
}
