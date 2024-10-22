class Solution {
    public int change(int amount, int[] coins) {
         int n=coins.length;
       int[][] dp=new int[n][amount+1];
       for(int[] row:dp)
       {
           Arrays.fill(row,-1);
       }
      return (helper(n-1,amount,coins,dp));
    }

    public static int helper(int index,int target,int[] coins,int[][] dp)
    {
        if(target==0)
        {
            return 1;
        }
        if(index<0 || target<0)
        {
            return 0;
        }
        if(dp[index][target]!=-1)
        {
            return dp[index][target];
        }
        int pick=helper(index,target-coins[index],coins,dp);
        int unpick=helper(index-1,target,coins,dp);

        return dp[index][target]=pick+unpick;


    }
}