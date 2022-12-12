package week11.day1212;

import java.util.Arrays;

public class MinCostPath3 {

//            1. 3 x 3의 배열만큼 dp선언하기 9:22
//
//            2.첫째칸만 있는 경우 9:37
//
//            3.첫째 행만 있을때 9:50
//
//            4.첫째 열만 있을때
//
//            5.나머지 경우

    public int getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (i > 0 && j == 0) {
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] minCost = {
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}
        };

        MinCostPath3 mcp = new MinCostPath3();
        mcp.getMinCost(minCost);
    }
}
