/*
You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Constraints:
The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Solution 1 - 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode fast = head ;
        ListNode slow = head ;
        
        int n= k ;
        n-- ;
        
        while(n>0){
            fast = fast.next ; 
            n--;
        }
        
        ListNode ff = fast ;
        fast = fast.next ;
        
        while(fast!=null)
        {
            fast = fast.next ;
            slow = slow.next ;
        }
        
       // System.out.println(ff.val+" "+slow.val);
        int temp = ff.val;
        ff.val = slow.val;
        slow.val = temp;
        
        return head ;
    }
}

// Solution 2 - 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode n = head; 
        ArrayList<ListNode> list = new ArrayList<>();
        
        while(n!=null){
            list.add(n);
            n = n.next;
        }
        
        int len = list.size();
        
        int temp = list.get(k-1).val;
        list.get(k-1).val = list.get(len-k).val;
        list.get(len-k).val = temp;
        
        return head;
    }
}
