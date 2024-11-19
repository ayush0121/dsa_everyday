class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i[]:dp) {
            Arrays.fill(i, -1);
        }
        return helper(0, n - 1, s, dp);
    }

    public int helper(int i, int j, String s, int[][] dp) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = 2 + helper(i + 1, j - 1, s, dp);
        } else {
            dp[i][j] = Math.max(helper(i + 1, j, s, dp), helper(i, j - 1, s, dp));
        }
        return dp[i][j];
    }
}