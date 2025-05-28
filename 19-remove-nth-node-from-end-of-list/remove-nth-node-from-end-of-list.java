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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        int totalNodes = 0;
        while(fast!= null && fast.next!=null && fast.next.next!=null){
            fast = fast.next.next.next;
            slow = slow.next;
            totalNodes++;
        }  
        if(fast== null){
            totalNodes = totalNodes*3;
        }else if(fast.next == null){
            totalNodes = totalNodes*3 +1;
        }else{
            totalNodes =totalNodes*3 +2;
        }
        int required = totalNodes - n;
        if(required == 0) return head.next;
    
    
    ListNode prev=null, curr = head;
    while(required > 0){
        prev = curr;
        curr = curr.next;
        required--;
    }
    prev.next = curr.next;
    return head;
    }
}