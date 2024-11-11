class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int [] arr3=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr1[j++]=nums[i];
                
            }else{
                arr2[k++]=nums[i];


            }
        }
        j=0;
        k=0;
        for(int i=0;i<arr3.length;i++ ){
            if(i%2==0){
                arr3[i]=arr1[j++];
            }else{
                arr3[i]=arr2[k++];
            }
        }
        return arr3;

        
    }
}