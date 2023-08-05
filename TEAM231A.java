import java.util.Scanner;

public class TEAM231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,co=0;
        int arr[]=new int [3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
                

            }

            
            
        }
        for(int j=0;j<3;j++){
                if(arr[j]==1){
                    count++;
                }
                if(count>1){
                    co++;
                }
            }
        
        System.out.println(co);
        
        

    
}
}
