class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=1;
        while(i<n&&j<n){
            if(arr[i]%2!=0&&arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i]%2==0){
                i=i+2;
            }
            else if(arr[j]%2==1){
                j=j+2;
            }
        }
        return arr;
    }
}