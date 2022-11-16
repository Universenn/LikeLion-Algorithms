package week7.day1116.programmers;

import java.util.Arrays;

public class NumberString {
    public int solution(String s) {
        String[] NumberS = {"zero", "one", "six", "two", "four", "five", "seven", "three", "eight", "nine"};
        String[] NumberI = {"0", "1", "6", "2", "4", "5", "7", "3", "8", "9"};
        for (int i = 0; i < NumberI.length; i++) {
            s = s.replace(NumberS[i], NumberI[i]);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        NumberString3 ns = new NumberString3();
        String text1 = "one4seveneight";
        String text2 = "23four5six7";
        String text3 = "1zerotwozero3";
        ns.solution(text1);
        ns.solution(text2);
        ns.solution(text3);
    }
}
