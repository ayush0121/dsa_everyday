package binarysearch;

import java.util.Scanner;

public class sqrt {
    static int sqrtofano(int x){
        int low=1;
        int high =x;
        int ans=0;
        while (low<=high){
            int mid =(low+high)/2;
            if(mid * mid ==x){
                return mid;
            }else if(mid * mid >x){
                high=mid-1;
            }else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sqrtofano(x));
    }
    
}
