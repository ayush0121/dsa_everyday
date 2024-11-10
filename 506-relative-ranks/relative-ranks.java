class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] vsort = Arrays.copyOf(score, score.length);
        
        Arrays.sort(vsort);
        for (int i = 0; i < vsort.length / 2; i++) {
            int temp = vsort[i];
            vsort[i] = vsort[vsort.length - 1 - i];
            vsort[vsort.length - 1 - i] = temp;
        }
        
        HashMap<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            if (i == 0)
                rankMap.put(vsort[i], "Gold Medal");
            else if (i == 1)
                rankMap.put(vsort[i], "Silver Medal");
            else if (i == 2)
                rankMap.put(vsort[i], "Bronze Medal");
            else
                rankMap.put(vsort[i], String.valueOf(i + 1));
        }
        
        String[] ranks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            ranks[i] = rankMap.get(score[i]);
        }
        
        return ranks;
    }
}