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
    public ListNode sortList(ListNode head) {
       if(head== null || head.next==null)return head;   
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;   
        }
        temp.next =null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        return merge(left,right);
    }
    public ListNode  merge(ListNode list1,ListNode list2){
          ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        if(list1!=null){
            curr.next = list1;
            list1= list1.next;
        }
        if(list2!=null){
            curr.next =list2;
            list2= list2.next;
        }
        return dummyHead.next;
    }

}