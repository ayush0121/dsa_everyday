import java.util.Scanner;
public class peakeleemnt {
    static int peak_ele(int nums[]){
        if(nums.length==1){
            return 0;
        }
       
        if(nums[nums.length-1]>=nums[nums.length-2]){
            return nums.length-1;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1]){
                return i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int[] nums=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(peak_ele(nums));
    }
    
}
