class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        int[] charCount = new int[26]; // Assuming lowercase English letters
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'a']++;

            while (isValid(charCount, k)) {
                count += s.length() - right;
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }

    private boolean isValid(int[] charCount, int k) {
        for (int count : charCount) {
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}
