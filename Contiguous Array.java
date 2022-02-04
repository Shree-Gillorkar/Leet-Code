/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) { // Base Case
            return 0;
        }
        // Converting all 0 to -1
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0; // current
        int max = 0; // final-ans
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // put reference in the starting of 0 & -1, as i have tell you in the starting  
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // cumulative sum
            if(map.containsKey(sum)){ // if cumulative sum key :- 0, -1, 1 already present
                int last = map.get(sum); // we get it's value
                max = Math.max(max, i - last); // and update max
            }
            else{ // if it's not present then create it's key-value pair
                map.put(sum, i);
            }
        }
        return max; // finally return it
    }
}
