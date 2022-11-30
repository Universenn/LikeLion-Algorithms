package week9.day1130;

public class BinaryTree {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        // a의 부모는
        int parentA = Math.floorDiv(3, 2);
        int parentB = Math.floorDiv(4, 5);

        System.out.printf("parentA: %d\n", parentA);
        System.out.printf("parentB: %d\n", parentB);
    }
}
