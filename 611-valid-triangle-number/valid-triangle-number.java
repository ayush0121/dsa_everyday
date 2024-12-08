class Solution {
    public int triangleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int low=0;
            int high=i-1;
            while(low<high){
                if(nums[low]+nums[high]>nums[i]){
                    ans+=(high-low);
                    high--;
                }else{
                    low++;
                }
            }
        }

        return ans;
        
    }
}