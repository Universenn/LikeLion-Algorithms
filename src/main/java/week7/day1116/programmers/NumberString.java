package week7.day1116.programmers;

import java.util.Arrays;

public class NumberString {
    public int solution(String m) {
        m = m.replace("zero","0");
        m = m.replace("one","1");
        m = m.replace("two","2");
        m = m.replace("three","3");
        m = m.replace("four","4");
        m = m.replace("five","5");
        m = m.replace("six","6");
        m = m.replace("seven","7");
        m = m.replace("eight","8");
        m = m.replace("nine","9");
        System.out.println(m);
        return Integer.parseInt(m);
    }

    public static void main(String[] args) {
        String m = "one4seveneight";
        System.out.println(m.replace("one","바귀어라"));

        System.out.println(m);
        NumberString2 ns = new NumberString2();
        ns.solution(m);
    }
}
