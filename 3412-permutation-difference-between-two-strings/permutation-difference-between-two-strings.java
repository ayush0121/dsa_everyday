class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm.put(t.charAt(i),i);
        }
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=Math.abs(i-hm.get(s.charAt(i)));
        }
        return res;

    }
}