class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer>ds=new ArrayList<>();
        int n=candidates.length;
        recursion(0,candidates,target,ds,res);
        return res;        
    }
    private void recursion(int start,int[] candidates,int target,List<Integer>ds,List<List<Integer>>res){
        if(start==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[start]<=target){
            ds.add(candidates[start]);
            recursion(start,candidates,target-candidates[start],ds,res);
            ds.remove(ds.size()-1);
        }
        recursion(start+1,candidates,target,ds,res);        
        
    }
}