import java.util.Scanner;


public class maxequliibriumsum {
    static int maxsum(int[] arr){
        /*int n =arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prefix_sum=arr[i];
            for(int j=0;j<i;j++){
                prefix_sum+=arr[j];
            }
            int suffix_sum=arr[i];
            for(int j=n-1;j>i;j--){
                suffix_sum+=arr[j];

            }
            if(prefix_sum==suffix_sum){
                res=Math.max(res,prefix_sum);

            }
        }
        return res;*/
        int n =arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prefix_sum=arr[i];
            for(int j=0;j<i;j++){
                prefix_sum+=arr[j];
            }
            int suffix_sum=arr[i];
            for(int j=n-1;j>i;j--){
                suffix_sum+=arr[j];
            }
            if(prefix_sum==suffix_sum){
                res=Math.max(res,prefix_sum);

            }
        }
        return res;

        


    }
     public static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(maxsum(arr1));

    }
    
}
