class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
        int length1 = numbers.length;
        for(int i = 0; i<=length1; i++){
            for(int j = i+1; j<length1; j++){
                if(numbers[i]+numbers[j]==target){
                   return new int[] {i+1, j+1};
                }
            }
        }
        return    new int[]{};
    }
}
