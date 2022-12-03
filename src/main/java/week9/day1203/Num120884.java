package week9.day1203;

public class Num120884 {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10){
            int service = chicken / 10;
            int nmg = chicken %  10;
            chicken = service + nmg;
            answer += service;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int chicken = 1999;
        int result = 0;
        Num120884 pg = new Num120884();
        pg.solution(chicken);
    }
}
