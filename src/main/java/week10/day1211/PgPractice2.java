package week10.day1211;

public class PgPractice2 {

    // 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
    // solution 을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다
    // n = 3, return : 수박수
    // n = 4, return : 수박수박

    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += i % 2 == 1 ? "수" : "박";
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) answer += "수";
            else answer += "박";
        }

        PgPractice2 pg = new PgPractice2();
        System.out.println(pg.solution(6));

        System.out.println(answer);
    }
}
