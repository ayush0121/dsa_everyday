class Solution {
    public int longestPalindrome(String s) {
        int [] freq=new int[127];
        int res=0;
        int odd=0;
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        for(int num:freq){
            if(num==0){
                continue;
            }
            res+=num-(num%2==1 ? odd:0);
            odd=(num%2==1 ?1 :odd);
        }        
        return res;
    }
}