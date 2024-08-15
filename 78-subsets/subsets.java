class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n =nums.length;
        List<List<Integer>> result =new ArrayList<>();
        int max=(1<<n);
        for(int pos=0;pos<max;pos++){
            List<Integer> ans=new ArrayList<>();
            for(int bitpos=0;bitpos<n;bitpos++){
                if((pos &(1<<bitpos))!=0){
                    ans.add(nums[bitpos]);
                }
            }
            result.add(ans);
        }
        
        return result;
        
    }
}