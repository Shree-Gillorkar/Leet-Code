/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null) return null;
        
        ListNode a_Pointer = headA;
        ListNode b_Pointer = headB;
        
        while(a_Pointer!=b_Pointer){
            
            if(a_Pointer == null){
                a_Pointer = headB;
            }else{
                a_Pointer = a_Pointer.next;
            }
            
            if(b_Pointer == null){
                b_Pointer = headA;
            }else{
                b_Pointer = b_Pointer.next;
            }
        }
        
        return a_Pointer;
    }
}
