package week7.day1114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos {
    public int[] primeNumber(int n) {
        int[] numbers = new int[n - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; j * i <= n; j++) {
                numbers[i * j - 2] = -1;
            }
        }
        return Arrays.stream(numbers).filter(num -> num > 0).toArray();

}
    public static void main(String[] args) {
        Eratos er = new Eratos();
        int[] num = er.primeNumber(50);
        System.out.println(Arrays.toString(num));
    }
}
