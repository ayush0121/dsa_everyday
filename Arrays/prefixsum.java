import java.util.Scanner;
public class prefixsum {
    static int getSum(int ps[], int l, int r){
        
    if(l==0)
        return ps[r];
        
    return ps[r]-ps[l-1];


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        
        
        
        int ps[];
        ps = new int[n];
        
        ps[0] = arr[0];
        
        for(int i=1; i<n; i++)
            ps[i] = ps[i-1]+ arr[i];
            
       System.out.println(getSum(ps, 1, 3));
    }
    
}
