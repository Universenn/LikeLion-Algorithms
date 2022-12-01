package week9.day1201;

public class Num120861 {
    //약수의 개수와 덧셈
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int hLimit = board[0]/2;
        int lLimit = board[1]/2;

        for (String s : keyinput) {
            if(s.equals("left")) answer[0]--;
            if (s.equals("right")) answer[0]++;
            if (s.equals("down")) answer[1]--;
            if (s.equals("up")) answer[1]++;

            if (answer[0]>hLimit) {
                answer[0] = hLimit;
            } else if (-(hLimit) > answer[0]){
                answer[0] = -(hLimit);
            }
            if (answer[1]>lLimit) {
                answer[1] = lLimit;
            } else if (-(lLimit) > answer[1]){
                answer[1] = -(lLimit);
            }
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
