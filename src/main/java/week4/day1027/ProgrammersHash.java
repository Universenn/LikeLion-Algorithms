package week4.day1027;

import java.util.HashMap;

public class ProgrammersHash {
    // 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    // 단 한 명의 선수는 어떤 선수인가?

    //1.HashMap memo에 Participant를 모두 넣을때 1로 초기화.
    //2.completion에 들어있는 이름을 key로 HashMap에 검색 합니다. 있으면 0으로 check
    //3.memo를 한바퀴 돌면서 1인 값을 찾습니다.
    //
    //Participant에 1명이 남습니다.
    //그러면 그 1명을 return

    private int size = 100000;

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> env  = new HashMap<>();
        for (String s : participant) {

        }
        return answer;
    }

}
