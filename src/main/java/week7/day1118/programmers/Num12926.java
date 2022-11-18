package week7.day1118.programmers;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Num12926 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arrC = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arrC[i] = s.charAt(i);
            if (64<arrC[i] && arrC[i]<91) {
                arrC[i] += n;
                if (90<arrC[i]) arrC[i] -= 26;
            }
            if (96<arrC[i] && arrC[i]<123) {
                arrC[i] += n;
                if (122<arrC[i]) arrC[i] -= 26;
            }

        }
        System.out.println(Arrays.toString(arrC));
        return String.valueOf(arrC);
    }

    public static void main(String[] args) {
        Num12926 pg = new Num12926();

        String s = "AB";
        int n = 1;
        pg.solution(s, n);

        String s2 = "z";
        int n2 = 1;
        pg.solution(s2, n2);

        String s3 = "a B z";
        int n3 = 4;
        pg.solution(s3, n3);

    }
}
