class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
        int l=1;
        int r=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            l=l*nums[i];
            r=r*nums[n-1-i];
            ans=Math.max(ans,l);
            ans=Math.max(ans,r);

            if(l==0){
                l=1;
            }
            if(r==0){
                r=1;
            }
        }
        return ans;
        
    }
}