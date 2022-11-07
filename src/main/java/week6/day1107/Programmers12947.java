package week6.day1107;

public class Programmers12947 {
    public boolean solution(int x) {

        int originX = x;

        // 자릿수 합
        int sumOfDigit = 0;

        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        System.out.println(sumOfDigit);

//        // 자릿수 합 나누기
//        boolean y = false;
//        if (sumOfDigit%x==0) {
//            System.out.println(sumOfDigit%x);
//            return true;
//        }

        // 자리수 합으로 나누어 지는지
        return originX % sumOfDigit == 0;
    }
    public static void main(String[] args) {

        Programmers12947 pg = new Programmers12947();
        pg.solution(687);
        System.out.println(pg.solution(687));
        System.out.println(pg.solution(10));
        System.out.println(pg.solution(12));
        System.out.println(pg.solution(11));
        System.out.println(pg.solution(13));

    }
}
