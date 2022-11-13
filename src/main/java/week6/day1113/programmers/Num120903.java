package week6.day1113.programmers;

public class Num120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        String[] s3 = {"n", "omg"};
        String[] s4 = {"m", "dot"};

        Num120903 pg = new Num120903();
        pg.solution(s1,s2);
        pg.solution(s3,s4);

    }
}
