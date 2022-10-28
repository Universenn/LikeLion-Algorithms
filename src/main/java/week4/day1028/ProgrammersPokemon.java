package week4.day1028;

import java.util.HashSet;
import java.util.Set;

public class ProgrammersPokemon {

        // 1. set을 이용해서 nums를 중복을 제거해준다.
        // Num을 set으로 추가시켜줌으로 중복제거를 했다.

        // 2. nums.length/2 가 set.size 가 더 크면 result 값이 nums.length/2
        // 3. nums.length/2 가 set.size 가 더 작으면 result 값이 set.size

    public int solution(int[] nums) {

        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int N = nums.length/2;  // 2

        if (N < set.size()){  // 2 < 3
            answer = N;
        }else answer = set.size();

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        ProgrammersPokemon pkm = new ProgrammersPokemon();

        System.out.println(pkm.solution(nums1));
        System.out.println(pkm.solution(nums2));
        System.out.println(pkm.solution(nums3));

    }

}
