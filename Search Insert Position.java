class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(target<=nums[0])return 0;
        
        for( int i= 0 ; i<=nums.length-1; i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
