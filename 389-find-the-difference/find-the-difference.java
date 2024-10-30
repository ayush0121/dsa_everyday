class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(char c: s.toCharArray()){
            sum1+=(int) c;
        }
        for(char c:t.toCharArray()){
            sum2+=(int) c;
        }
        return (char) (sum2-sum1);
        
    }
}