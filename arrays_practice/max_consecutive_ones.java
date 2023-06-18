package arrays_practice;
import java.util.Scanner;

public class max_consecutive_ones {

static int cons(int arr[],int n ){
        int res=0;
        int current=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                current=0;
            }else{
                current++;
                res=Math.max(current, res);
            }
        }
        return res;
    }
        


    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int  arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(cons(arr, n));
        
    }

    
}
    

