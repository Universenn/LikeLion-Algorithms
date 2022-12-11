package week10.day1211;

public class PgPractice3 {

    // lv.0 특정 문자 제거하기
    public String solution(String my_string, String letter) {
        String result = "";
        result = my_string.replace(letter, "");
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        PgPractice3 pg = new PgPractice3();
        String my_string = "abcdef";
        String letter = "f";
        pg.solution(my_string, letter);
    }
}
