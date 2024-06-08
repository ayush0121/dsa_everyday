class Solution {
    public int longestOnes(int[] nums, int k) {
        int start =0;
        int end=0;
        int zero=0;
        while(end<nums.length){
            if(nums[end]==0){
                zero++;
            }
            end++;
            if(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
        }
        return end-start;

        
    }
}