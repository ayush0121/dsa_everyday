class Solution {

    //kadane's algorithm'
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int maxending=nums[0];
        for(int i=1;i<n;i++){
            maxending=Math.max(maxending+nums[i],nums[i]);
            res=Math.max(maxending,res);
        }
        return res;
        
    }
}