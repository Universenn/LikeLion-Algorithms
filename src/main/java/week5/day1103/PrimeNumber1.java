package week5.day1103;

public class PrimeNumber1 {
//        실습1
//        2, 2
//        3, 4
//        4, 6
//        5, 8
//        … 을 출력 해보세요 multipleOf가 100까지
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            System.out.println(i+", "+2*(i-1));
        }

        return 0;
    }

    public static void main(String[] args) {
        PrimeNumber1 pr1 = new PrimeNumber1();
        System.out.println(pr1.solution(98));
    }


}
