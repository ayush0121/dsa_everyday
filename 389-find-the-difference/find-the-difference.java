class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            int ascii1=(int) s.charAt(i);
            sum1+=ascii1;
        }

        for(int j=0;j<t.length();j++){
            int ascii2=(int) t.charAt(j);
            sum2+=ascii2;
        }
        int complement=sum2-sum1;
        char c=(char) complement;
        return c; 
        
    }
}