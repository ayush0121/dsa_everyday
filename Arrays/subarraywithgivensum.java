import java.util.Scanner;

public class subarraywithgivensum {

    //naive approach with time complexity O(n square)
    /*static boolean Subaru(int arr[], int sum){
        
        for(int i=0;i<arr.length;i++){
            int cur_sum=0;
            for(int j=i;j<arr.length;j++){
                cur_sum+=arr[j];
                if(cur_sum==sum){
                    return true;
                }
            }

        }
        return false;*/

        //efficient approach for the solution with time complexity O(n) through sliding window technique 
        static boolean Subaru(int arr[],int sum){
            int s=0;
            int cur=0;
            for(int i=0;i<arr.length;i++){
                cur+=arr[i];
                while(cur>sum){
                    cur-=arr[s];
                    s++;


                }
                if(cur==sum){
                    return true;
                }
            }
            return false;
        }


        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int newa[]=new int[n];
        int sum=sc.nextInt();
        for(int i=0;i<n;i++){
            newa[i]=sc.nextInt();
        }
        System.out.println(Subaru(newa, sum));
    }
    
}
