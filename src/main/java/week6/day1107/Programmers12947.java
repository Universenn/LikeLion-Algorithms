package week6.day1107;

public class Programmers12947 {
    public boolean solution(int x) {

        // 자릿수 합
        int sumOfDigit = 0;

        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        System.out.println(sumOfDigit);


        // 자리수 합으로 나누어 지는지
        return false;
    }
    public static void main(String[] args) {

        Programmers12947 pg = new Programmers12947();
        pg.solution(687);

    }
}
