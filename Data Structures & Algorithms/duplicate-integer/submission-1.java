class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        boolean dup = false;

        for(int i = 0 ;  i < nums.length; i++) {

            if(!set.add(nums[i])){
                dup =  true;
            }

        }
        
    return dup;

    }
}