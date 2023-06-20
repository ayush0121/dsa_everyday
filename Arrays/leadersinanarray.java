import java.util.Scanner;
public class leadersinanarray {
    static void leadarray(int arr[],int n ){
         int cur_arr=arr[n-1];
        System.out.println(cur_arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>cur_arr){
                cur_arr=arr[i];
                System.out.println(cur_arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leadarray(arr,n);
    }
    
}
