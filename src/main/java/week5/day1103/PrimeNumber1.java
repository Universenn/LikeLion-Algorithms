package week5.day1103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public int solution2(int n) {
        int N = 50;
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2;
        return 0;
    }

    public static void main(String[] args) {
        PrimeNumber1 pr1 = new PrimeNumber1();
        System.out.println(pr1.solution(98));

        int N = 50;

        int[] nums = new int[N-1];

        boolean[] checks = new boolean[nums.length];

        Arrays.fill(checks, true);

        for (int i = 0; i < nums.length; i++) nums[i] = i + 2;
        System.out.println(Arrays.toString(nums));

        int maltipleOf = 2;

        for (int i = 2; i < nums.length; i+=maltipleOf) {
            checks[i] = false;
        }
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) {
                primes.add(nums[i]);
            }
        }
        System.out.println(primes);

    }


}
