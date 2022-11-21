package week7.day1121.programmers;

public class Num12912 {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = 0;
        if (a>b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Num12912 pg = new Num12912();
        pg.solution(5, 3);
    }
}
