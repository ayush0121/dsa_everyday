class Solution {
    public int removeDuplicates(int[] nums) {

        //Insert all array element in the Set. 
        //Set does not allow duplicates and sets like LinkedHashSet maintains the order of insertion so it will remove duplicates and elements will be printed in the same order in which it is inserted

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        //copy unique element back to array
        int i = 0;

        for(int ele:set){
            nums[i++] = ele;
        }
        return set.size();
    }
}