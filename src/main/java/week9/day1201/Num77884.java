package week9.day1201;

public class Num77884 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) cnt ++;
            }
            if (cnt % 2 == 0) {
                answer += i;
            }else answer -= i;

        }
        return answer;
    }
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        Num77884 pg = new Num77884();
        System.out.println(pg.solution(left, right));
    }
}
