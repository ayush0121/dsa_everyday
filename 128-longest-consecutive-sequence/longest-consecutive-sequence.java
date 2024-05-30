import java.util.HashSet;

class Solution {
public int longestConsecutive(int[] nums) {
// Step 1: Handle the base case when the array is empty.
if (nums.length == 0) {
return 0;
}

    HashSet<Integer> set = new HashSet<>();

    // Step 2: Insert all elements of 'nums' into the hash set 'set'.
    for (int num : nums) {
        set.add(num);
    }

    int cnt = 1;        // Initialize a counter for the current consecutive sequence length.
    int longest = 0;    // Initialize a variable to store the maximum consecutive sequence length.

    // Step 3: Iterate through the elements of 'nums'.
    for (int num : nums) {
        // Step 4: If the current element 'num' is the start of a sequence (no 'num-1' in 'set'),
        if (!set.contains(num - 1)) {
            int x = num; // Update 'x' to the current element 'num'.
            cnt = 1;
            // Step 5: While consecutive elements exist in 'set', increment 'cnt' and 'x'.
            while (set.contains(x + 1)) {
                cnt++;
                x = x + 1;
            }
        }
        
        // Step 6: Update 'longest' with the maximum of 'longest' and 'cnt'.
        longest = Math.max(longest, cnt);
    }

    // Step 7: Return 'longest' as the result.
    return longest;
}
}
