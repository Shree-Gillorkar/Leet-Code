/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
 
Constraints:
1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(int key : map.keySet()){
            heap.add(key);
        }
        
        int[] res = new int[k];
        for(int i =0; i<k; i++){
            res[i]=heap.poll();
        }
        return res;
    }
}
