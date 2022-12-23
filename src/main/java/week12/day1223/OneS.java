package week12.day1223;

public class OneS {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String s1 = "abcabcadc";
        String s2 = "abdc";
        String s3 = "hello";

        OneS oneS = new OneS();
        String result1 = oneS.solution(s1);
        String result2 = oneS.solution(s2);
        String result3 = oneS.solution(s3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
