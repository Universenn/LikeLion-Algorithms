package week9.day1128;

public class Alphabet {
    public static void main(String[] args) {
        for (char c = 'A'; c < 'Z'; c++) {
            System.out.println(c);
        }
        int n = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(c);
                System.out.println(i);
                n++;
            }
        }
        System.out.println(n);
        alphabet('A');
    }

    public static void alphabet(char c) {
        if (c>'Z')return;
        System.out.println(c);
        alphabet((char)(c+1));
    }
}
