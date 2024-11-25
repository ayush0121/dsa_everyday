class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
      int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            for(int j=l;j<=r;j++){
                if(i+j-1<nums.size()){
                    int sum=0;
                    
                    for(int k=0;k<j;k++){
                        sum+=nums.get(i+k);
                        
                    }
                    if(sum>0){
                            min=Math.min(min,sum);
                        }
                }
            }
          
        }
        return min == Integer.MAX_VALUE ? -1 : min;
        
    }
}