import java.util.*;
import java.io.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //       PRINTING THE LARGEST ELEMENT INDEX IN THE ARRAY
        
        
        /*int res=0; 
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println(res);*/

        //       PRINTING THE LARGEST ELEMENT IN THE ARRAY



        /*int res=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        System.out.println(res);*/

        //    CHECKING IF THE ARRAY IS SORTED OR NOT 

        /*for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("False");;
            }
           
            
        }
        System.out.println("True");*/

        //     REVERSING THE ARRAY

        /*int low=0;
        int high =arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/


        //      MOVING ZEROES TO END OF THE ARRAY

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int low =i;
                int high=arr.length-1;
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        
        
    }
}