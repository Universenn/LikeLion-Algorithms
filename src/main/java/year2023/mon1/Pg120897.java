package year2023.mon1;

public class Pg120897 {

    public int[] solution(int n) {
        int[] answer = new int[10000];
        int arr = 0;

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                answer[arr] = i;
                arr++;
            }
            int[] result = new int[arr];
            for (int j = 0; j < arr; j++) {
                if (answer[i] != 0) {
                    result[j] = answer[i];
                }

            }

        }

        return answer;
    }
    public static void main(String[] args) {

        Pg120897 pg = new Pg120897();
        int n = 24;
        pg.solution(n);

    }
}
