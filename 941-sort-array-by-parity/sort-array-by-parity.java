class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                int temp=nums[pos];
                nums[pos]=nums[i];
                nums[i]=temp;
                pos++;
            }
        }
        if(n==0){
            return nums;
        }
        return nums;
        
    }
}