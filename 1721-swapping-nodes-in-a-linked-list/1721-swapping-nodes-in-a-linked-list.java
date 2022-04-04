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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode fast=head;
        ListNode slow=head;
        ListNode kstart=null,kend=null;

        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        kstart=fast;
        
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        kend=slow;
        
        int temp=kstart.val;
        kstart.val=kend.val;
        kend.val=temp;
        
        return head;
        
    }
}