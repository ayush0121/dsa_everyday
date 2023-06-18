import java.util.Scanner;

public class slidingwindow {
    static int slidingconcept(int arr[], int n , int k){
        int cur_sum=0;
        for(int i=0;i<k;i++){
            cur_sum+=arr[i];
        }
        int max_sum=cur_sum;
        for(int i=k;i<n;i++){
            cur_sum+=(arr[i]-arr[i-k]);
            max_sum=Math.max(max_sum, cur_sum);
        }
        return max_sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++ ){
            arr[i]=sc.nextInt();
        }
        System.out.println(slidingconcept(arr, n, k));
    }
    
}
