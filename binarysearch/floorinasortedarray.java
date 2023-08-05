package binarysearch;

import java.util.Scanner;

public class floorinasortedarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int [n];
        for(int i=0 ;i <n;++i ){
            arr[i]=sc.nextInt();
    }
    System.out.println("floor of 5 is "+floor(arr,5));
    }
static int floor(int arr[], int target){
int low=0;
int high=arr.length-1;
while(low<high){
    int mid=low+high/2;
    if(arr[mid]==target){
        return mid;
    }
    else if (arr[mid]<target){
        low=mid+1;
    }
    else{
        high=mid;
    }
}
return low;
}
}