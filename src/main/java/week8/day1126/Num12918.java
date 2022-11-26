package week8.day1126;

import java.util.Arrays;

public class Num12918 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        String[] nArr = {"1","2","3","4","5","6","7","8","9","0"};
        String[] sArr = s1.split("");
        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < nArr.length; j++) {

            }

        }
        System.out.println(Arrays.toString(s1.split("")));


        System.out.println(Arrays.toString(sArr));

    }
}
