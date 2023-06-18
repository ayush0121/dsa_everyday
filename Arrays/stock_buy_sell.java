import java.util.Scanner;

public class stock_buy_sell{
    static int profit(int price[], int n){
        int profit=0;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit +=price[i]-price[i-1];
            }
        }
        return profit;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        
        int price[]=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        System.out.println("The maximum profit is : " +profit(price, n));
        
        

    }
}