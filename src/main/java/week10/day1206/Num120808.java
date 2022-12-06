package week10.day1206;

public class Num120808 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int topNum = num1*denum2 + num2*denum1;
        // 분모
        int botNum = num1*num2;
        // 최소 공배수
        int maximum = 1;
        // 약분
        for(int i = 1 ; i <= topNum ; i ++) {
            if(topNum%i == 0 && botNum%i == 0) {
                maximum = i;
            }
        }

        return new int[]{topNum / maximum, botNum / maximum};
    }
    public static void main(String[] args) {
        Num120808 pg = new Num120808();
        pg.solution(1,2,3,4);
        pg.solution(9,2,1,3);
        System.out.println((1/2) + (3/4));
        int denum1 = 1;
        int denum2 = 3;

        int num1 = 2;
        int num2 = 4;


    }
}
