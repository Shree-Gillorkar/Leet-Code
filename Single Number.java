class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            if(countOccurrences(nums, nums.length, x)==1){
                return x;
            }
        }
        return 0;
    }
    
    int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
           if (x == arr[i])
             res++;
         return res;
    }
}
