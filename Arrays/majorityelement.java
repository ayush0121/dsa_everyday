import java.util.Scanner;
public class majorityelement {
    static int majority(int[] arr){
        int count=0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            int candidate=arr[i];
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>n/2){
                    return candidate;
                }


            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majority(arr));
        
    }
    
}
