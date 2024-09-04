class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> mp1=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)-1);
        }
        for(int val: mp1.values()){
            if(val!=0){
                return false;
            }
        }
        return true;

        
    }
}