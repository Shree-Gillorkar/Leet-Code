import java.util.Scanner;
class Solution {
    int[] twoSum(int[] nums, int target) {
        int length1 = nums.length;
        for(int i =0; i<length1;i++){
            for(int j=i+1; j<length1;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    
    public void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
