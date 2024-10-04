class Solution {
    public int pivotInteger(int n) {
         int totalSum = n * (n + 1) / 2;
        
        // Iterate to find the pivot integer x
        int leftSum = 0;
        for (int x = 1; x <= n; x++) {
            leftSum += x;
            
            // The right sum is totalSum - leftSum + x
            if (leftSum == totalSum - leftSum + x) {
                return x;
            }
        }
        return -1;
        
    }
}