class NumArray {
    int total=0;
List<Integer> prefix=new ArrayList<>();
    public NumArray(int[] nums) {
        for(int n :nums){
            total+=n;
            prefix.add(total);
        }
        
    }
    
    public int sumRange(int left, int right) {
        int rightsum=prefix.get(right);
        int leftsum=0;
        if(left>0){
            leftsum=prefix.get(left-1);
        }
        return rightsum-leftsum;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */