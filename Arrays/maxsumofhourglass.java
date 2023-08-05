import java.util.Scanner;

public class maxsumofhourglass {
    static int maxsumhourglass(int[] [] arr, int r, int c){
        int maxsum=Integer.MIN_VALUE;
        if(r<3 || c<3){
            System.out.println("not possible");
            System.exit(0);
        }
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                int sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                maxsum=Math.max(maxsum, sum);

            }
        }
        return maxsum;

    }
    public static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr1=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int res=maxsumhourglass(arr1, r, c);
        System.out.println(res);

    }
    
}
