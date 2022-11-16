package week7.day1116.programmers;

import java.util.Arrays;

public class NumberString {
    public int solution(String m) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven","eight", "nine"};
        for (int i = 0; i < m.length(); i++) {
            m = m.replace(numArr[i],String.valueOf(i));
        }
        return Integer.parseInt(m);
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
