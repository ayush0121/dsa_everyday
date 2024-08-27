class Solution {
    public boolean canPartition(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int target = total / 2;
        if(total % 2 != 0) return false;

        // return helper(nums, 0, target);

        // Boolean[][] dp = new Boolean[nums.length + 1][total + 1];
        // for(Boolean[] row : dp) Arrays.fill(row, null);
        // return helperMem(nums, 0, target, dp);

        // return helperTab(nums, total);

        return helperSO(nums, total);
    }

    // Recursive Solution
    public boolean helper(int[] nums, int index, int target){
        if(index >= nums.length) return false;
        if(target < 0) return false;
        if(target == 0) return true;

        boolean inc = helper(nums, index + 1, target - nums[index]);
        boolean exc = helper(nums, index + 1, target);

        return (inc || exc);
    }

    // Memoization Solution
    public boolean helperMem(int[] nums, int index, int target, Boolean[][] dp){
        if(index >= nums.length) return false;
        if(target < 0) return false;
        if(target == 0) return true;

        if(dp[index][target] != null) return dp[index][target];

        boolean inc = helperMem(nums, index + 1, target - nums[index], dp);
        boolean exc = helperMem(nums, index + 1, target, dp);

        return dp[index][target] = (inc || exc);
    }

    // Tabulation Method
    public boolean helperTab(int[] nums, int total){
        Boolean[][] dp = new Boolean[nums.length + 1][total + 1];
        for(Boolean[] row : dp) Arrays.fill(row, false);

        for(int i = 0; i <= nums.length; i++) dp[i][0] = true;

        for(int index = nums.length - 1; index >= 0; index--){
            for(int target = 0; target <= total / 2; target++){
                boolean inc = false;
                if(target - nums[index] >= 0)
                    inc = dp[index + 1][target - nums[index]];
                
                boolean exc = dp[index + 1][target];

                dp[index][target] = (inc || exc);
            }
        }
        return dp[0][total / 2];
    }

    // Space Optimization Method
    public boolean helperSO(int[] nums, int total){
        Boolean[] curr = new Boolean[total + 1];
        Boolean[] next = new Boolean[total + 1];

        Arrays.fill(curr, false);
        Arrays.fill(next, false);

        curr[0] = true;
        next[0] = true;

        for(int index = nums.length - 1; index >= 0; index--){
            for(int target = 0; target <= total / 2; target++){
                boolean inc = false;
                if(target - nums[index] >= 0)
                    inc = next[target - nums[index]];
                
                boolean exc = next[target];

                curr[target] = (inc || exc);
            }
            next = curr.clone();
        }
        return next[total / 2];
    }    
} 