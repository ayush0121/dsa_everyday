class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);

        }
        int a=k-1;
        for(int i=0;i<a;i++){
            pq.remove();

        }
        return pq.peek();
    }
}