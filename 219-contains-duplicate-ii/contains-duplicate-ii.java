class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                int j =hp.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            hp.put(nums[i],i);
        }
        return false;
        
    }
}