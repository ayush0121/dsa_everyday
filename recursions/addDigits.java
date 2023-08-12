package recursions;
import java.util.Scanner;

public class addDigits {
    static int sumofdigits(int num){
        if(num<10){
            return num;
        }
        return sumofdigits(num/10)+num%10;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("Sum of digits is "+sumofdigits(a));
    }
    
}
