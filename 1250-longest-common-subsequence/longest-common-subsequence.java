class Solution {
    public int lcs(String text1, String text2, int ind1, int ind2, int[][] dp){
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1)==text2.charAt(ind2)){
            return dp[ind1][ind2]=1+lcs(text1,text2,ind1-1,ind2-1,dp);
        }else{
            return dp[ind1][ind2]=Math.max(lcs(text1,text2,ind1-1,ind2,dp),lcs(text1,text2,ind1,ind2-1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n =text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return lcs(text1,text2,n-1,m-1,dp);
        
    }
}