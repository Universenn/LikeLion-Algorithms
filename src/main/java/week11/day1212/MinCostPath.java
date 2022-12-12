package week11.day1212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCostPath {

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

        int[][] test1 = new int[2][5];
        int[][] test2 = new int[5][3];

        List<Integer> minList = new ArrayList<>();
        for (int i = 0; i < minCost[0].length; i++) {
        }

        MinCostPath mcp = new MinCostPath();
        mcp.getMinCost(minCost);
        mcp.getMinCost(test1);
        mcp.getMinCost(test2);
    }
}
