package week10.day1211;

public class PgPractice {
    public String solution(String my_string, int n) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                result += String.valueOf(my_string.charAt(i));
            }
        }
        return result;
    }

    public String solution2(String my_string, int n) {
        String result = "";
        String[] str = my_string.split("");
        for (String s : str) {
            result += s.repeat(n);
        }
        System.out.println(result);
        return result;
    }

    public String solution3(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.append((c+"").repeat(n));
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String result = "";

        PgPractice pg = new PgPractice();
//        pg.solution(my_string, n);
//
//        pg.solution2(my_string, n);
        pg.solution3(my_string, n);

        char[] chr = my_string.toCharArray();
        for (char c : chr) {
            System.out.print(c+"*");
        }
        System.out.println();
        System.out.println(my_string.repeat(3));
//        System.out.println(chr);


//        System.out.print(my_string.charAt(0));
//        System.out.print(my_string.charAt(0));
//        System.out.print(my_string.charAt(0));
//        System.out.print(my_string.charAt(1));
//        System.out.print(my_string.charAt(1));
//        System.out.print(my_string.charAt(1));
//        System.out.print(my_string.charAt(2));
//        System.out.print(my_string.charAt(2));
//        System.out.print(my_string.charAt(2));
//        System.out.print(my_string.charAt(3));
//        System.out.print(my_string.charAt(3));
//        System.out.print(my_string.charAt(3));
//        System.out.print(my_string.charAt(4));
//        System.out.print(my_string.charAt(4));
//        System.out.print(my_string.charAt(4));
//
//        System.out.println("========================");
////        result += String.valueOf(my_string.charAt(0));
////        result += String.valueOf(my_string.charAt(0));
////        System.out.println(result);
//
//        for (int i = 0; i < my_string.length(); i++) {
//            for (int j = 0; j < n; j++) {
//                result += String.valueOf(my_string.charAt(i));
//            }
//        }
//        System.out.println(result);
//    }
    }
}
