class Solution {
    public int rob(int[] nums) {
         int prevNo = 0;
         int prevYes = 0;
         for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
    }
    return Math.max(prevNo, prevYes);
    }
    
}
