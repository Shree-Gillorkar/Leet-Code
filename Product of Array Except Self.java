/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
      
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        
        pre[0] = post[n-1] = 1;
        
        for(int i=1,j=n-2;i<n;i++,j--){
             pre[i] = pre[i-1]*nums[i-1];
             post[j] = post[j+1]*nums[j+1];
        }
        
        for(int i=0; i<n;i++){
            pre[i] = pre[i]*post[i];
        }
        
        return pre;
    }
}
