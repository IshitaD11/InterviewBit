package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumSquareSubMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(List.of(1, 1, 1, 1, 1)));
        A.add(new ArrayList<>(List.of(2, 2, 2, 2, 2)));
        A.add(new ArrayList<>(List.of(3, 8, 6, 7, 3)));
        A.add(new ArrayList<>(List.of(4, 4, 4, 4, 4)));
        A.add(new ArrayList<>(List.of(5, 5, 5, 5, 5)));
        
        int B = 3;

        int ans = solve(A,B);
        System.out.println(ans);
    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        
        int rows = A.size();
        int cols = A.get(0).size();
        int[][] dp = new int[rows][cols];
 
        // Calculate cumulative sum matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = A.get(i).get(j);
                if (i > 0) dp[i][j] += dp[i - 1][j]; // Add sum from top
                if (j > 0) dp[i][j] += dp[i][j - 1]; // Add sum from left
                if (i > 0 && j > 0) dp[i][j] -= dp[i - 1][j - 1]; // Remove overlapping
            }
        }
 
        int maxSum = Integer.MIN_VALUE;
 
        // Iterate through possible submatrices
        for (int i = B-1; i < rows; i++) {
            for (int j = B-1; j < cols; j++) {
                int submatrixSum = dp[i][j];
                if (i >= B) submatrixSum -= dp[i - B][j]; // Subtract sum from top
                if (j >= B) submatrixSum -= dp[i][j - B]; // Subtract sum from left
                if (i >= B && j >= B) submatrixSum += dp[i - B][j - B]; // Add overlapping
 
                // Update maximum submatrix sum
                if (submatrixSum > maxSum) {
                    maxSum = submatrixSum;
                }
            }
        }
 
        return maxSum;
    }
}
