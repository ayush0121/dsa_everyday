class Solution {
    public int trap(int[] height) {
        int[] a=new int[ height.length];
        int[] b =new int[height.length];
        a[0]=height[0];
        for(int i=1;i<height.length;i++){
            a[i]=Math.max(a[i-1],height[i]);
        }
        b[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            b[j]=Math.max(height[j],b[j+1]);
        }
        int ans=0;
        for(int i=0;i<height.length;i++){
            ans+=(Math.min(a[i],b[i])-height[i]);
        }
        return ans;
       
        
        
    }
    
}