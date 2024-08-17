class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create a hashmap to count occurrences of each element in nums1
        Map<Integer, Integer> box = new HashMap<>();
        for (int num : nums1) {
            box.put(num, box.getOrDefault(num, 0) + 1);
        }

        // List to store the intersection result
        List<Integer> res = new ArrayList<>();
        
        // Find intersection elements from nums2
        for (int num : nums2) {
            if (box.getOrDefault(num,0) > 0) {
                res.add(num);
                box.put(num, box.get(num) - 1);
            }
        }

        // Convert the result list to an array
        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }
        return resultArray;
    }
}