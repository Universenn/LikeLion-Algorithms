package week9.day1130;

public class Num12916 {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='p'||s.charAt(i)=='P') {
                p++;
            }
            if (s.charAt(i)=='y'||s.charAt(i)=='Y') {
                y++;
            }
        }
        return p==y;
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
//        System.out.println(s.charAt(1)=='P');
        Num12916 pg = new Num12916();
//        pg.solution("pPoooyY");
        System.out.println(pg.solution("pPoooyY"));
    }
}
