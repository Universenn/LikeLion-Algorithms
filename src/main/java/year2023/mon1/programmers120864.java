package year2023.mon1;

import java.util.Arrays;

public class programmers120864 {
    public int solution(String my_string) {
        char[] arrC = my_string.toCharArray();
        int sum = 0;
//        System.out.println(arrC[0]);
        for (int i = 0; i < arrC.length; i++) {
            System.out.println(arrC[i]);
            if (0<arrC[i]&&arrC[i]<=9) {
                sum += arrC[i];
            }
        }
        System.out.println(sum);
        return 0;
    }

    public int solution2(String my_string) {
        int answer = 0;
        String[] ms = my_string.split("[a-zA-Z]");
        String[] ms1 = my_string.split("[0-9]");
        System.out.println(Arrays.toString(ms));
        System.out.println(Arrays.toString(ms1));
        for (int i = 0; i < ms.length; i++) {
            answer+= !ms[i].isEmpty() ? Integer.parseInt(ms[i]) :0;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String my_string_1 = "aAb1B2cC34oOp";

        programmers120864 pg = new programmers120864();
        pg.solution2(my_string_1);
    }
}
