package week6.day1112.programmers;

public class Programmers120830 {
    public int solution(int n, int k) {
        int answer = n*12000+k*2000;
        if(n>=10) answer -= (n/10)*2000;
        return answer;
    }
}
