class Solution {
    public int maxSubArray(int[] nums) {
        
        int[] table = new int[nums.length];
        int max =  nums[0];
        table[0] = nums[0];
        
        for( int i =1; i< nums.length; i++){
            table[i] = Math.max(nums[i],nums[i]+table[i-1]);
            max= Math.max(max, table[i]);
        }
        return max;
    }
}
