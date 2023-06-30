import java.util.Scanner;

public class maxproductsubarray {
    static int productsubarray(int[] arr){
        int result=arr[0];
        int n =arr.length;
        for(int i=0;i<n;i++){
            int mul=arr[0];
            for(int j=i+1;j<n;j++){
                result=Math.max(result,mul);
                mul*=arr[j];
            }
            result=Math.max(result,mul);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(productsubarray(arr1));
        
    }
    
}
    

    
    

