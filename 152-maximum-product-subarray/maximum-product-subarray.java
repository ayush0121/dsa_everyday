class Solution {
    public int maxProduct(int[] nums) {
        double maxSum=nums[0];
        double l=1;
        double r=1;
        for(int i=0;i<nums.length;i++){
        l=l*(double)nums[i];
        r=r*(double)nums[nums.length-1-i];
       
        maxSum=Math.max(l,maxSum);
        maxSum=Math.max(r,maxSum);
         if(l==0){
            l=1;
        }
        if(r==0){
            r=1;
        }
        }
        return (int)maxSum;
        
    }
}