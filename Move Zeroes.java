class Solution {
    public void moveZeroes(int[] nums) {
        int[] zeroLast = new int[nums.length];
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                //System.out.println(nums[i]);
                zeroLast[j]=nums[i];
                j++;
             }
        }
        
      for(int i =0; i<nums.length; i++){
          nums[i] = zeroLast[i];
      }
    }
}
