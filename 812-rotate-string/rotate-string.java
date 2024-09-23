class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        HashMap<Character, Integer> mp1=new HashMap<>();
        HashMap<Character, Integer> mp2=new HashMap<>();
        for(char ch: s.toCharArray()){
            mp1.put(ch, mp1.getOrDefault(ch,0)+1);

        }
        for(char ch :goal.toCharArray()){
            mp2.put(ch, mp2.getOrDefault(ch,0)+1);
        }
        if(!mp1.equals(mp2)){
            return false;
        }
         String doubledS = s + s; // Concatenate s with itself
        return doubledS.contains(goal);
        

        
    }
}