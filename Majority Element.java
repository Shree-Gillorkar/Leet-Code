class Solution {
    public int majorityElement(int[] nums) {
      if(nums.length==1)
          return nums[0];
       int majorityCount = nums.length/2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }
}
