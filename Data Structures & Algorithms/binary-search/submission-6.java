class Solution {
    public int search(int[] nums, int target) {
        int l = 0 , r = nums.length - 1 , m = -1;

        while(l<= r){
            
             m = (l+r)/2;

           if(nums[m] == target){
                return m;
            }else if(target > nums[m]){
                l++;
            }else{
                r--;
            }
        } 

        return -1;
    }
}
