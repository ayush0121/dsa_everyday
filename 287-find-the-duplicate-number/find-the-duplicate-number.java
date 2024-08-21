class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp=new HashMap<>();
        for(int num: nums){
           if(mpp.containsKey(num)){
            return num;
           }else{
            mpp.put(num,1);
           }
        
        }
        return -1;
       
    }
}