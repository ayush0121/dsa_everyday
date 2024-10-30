class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int F = 0;

        // Calculate F(0) and sum(nums)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }

        int max = F; // Start with F(0) as the maximum

        // Calculate F(k) for k = 1 to n - 1
        for (int k = 1; k < n; k++) {
            // Use the relationship F(k) = F(k - 1) + sum(nums) - n * nums[n - k]
            F = F + sum - n * nums[n - k];
            max = Math.max(max, F);
        }

        return max;
    }
}
