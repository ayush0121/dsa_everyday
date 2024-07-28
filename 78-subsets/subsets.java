class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n =nums.length;
        int a=(1<<n);
        for(int i=0;i<a;i++){
            List<Integer> ans1=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    ans1.add(nums[j]);
                }
            }
            ans.add(ans1);
        }
        return ans;
    }
}