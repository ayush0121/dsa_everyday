class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hp=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for (int num : nums) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }
        for(int num:hp.keySet()){
            if(hp.get(num)>1){
                result.add(num);
                
            }
        }
        return result;
    }
}