class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int right=0;right<s.length();right++){
            if(!mpp.containsKey(s.charAt(right)) || mpp.get(s.charAt(right))<left) {
                mpp.put(s.charAt(right),right);
                max=Math.max(max,right-left+1);
            }else{
                left=mpp.get(s.charAt(right))+1;
                mpp.put(s.charAt(right),right);
            }

        }
        return max;
    }
}