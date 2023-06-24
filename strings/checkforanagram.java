package strings;

import java.util.Scanner;

public class checkforanagram {
    static boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
    int count[]=new int[256];
    for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    for(int i=0;i<256;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(anagram(s1, s2));
    }
    
}
