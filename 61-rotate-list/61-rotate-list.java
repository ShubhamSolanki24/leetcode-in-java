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
    public ListNode rotateRight(ListNode head, int k) {
 
        if(head==null || k==0)
        { return head; 
        }
       int length = 0;
       ListNode temp = head;
        
        while(temp.next !=null){
            length++;
            temp = temp.next;
        }
        
          length++;
        temp.next = head;
        int rotpt = length - k % length;
      temp = head;
      
        while(rotpt-- >1){
            temp =temp.next;
        }
        head= temp.next;
        temp.next = null;
        return head;
        
        
    }
}