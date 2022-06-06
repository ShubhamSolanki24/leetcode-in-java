/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    int len1=0,len2=0;
        ListNode* curr = headA;
        
        while(curr){
            ++len1;
            curr = curr->next;
        }
        
        curr = headB;

        while(curr){
            ++len2;
            curr = curr->next;
        }
        
        if(len1>=len2){
            
            int d = len1-len2;
            ListNode* fast = headA;
            ListNode* slow = headB; 
            while(d--)
                fast=fast->next;
            
            while(fast!=slow){
                fast = fast->next;
                slow = slow->next;
            }
            
            return slow;
        }
        else{
            
            int d = len2-len1;
            ListNode* slow = headA;
            ListNode* fast = headB; 
            while(d--)
                fast=fast->next;
            
            while(fast!=slow){
                fast = fast->next;
                slow = slow->next;
            }
            
            return slow;
            
        }
        
        return nullptr;
        
        
        /* ListNode* a = headA,*b = headB;
        while(a!=b){
            if(a==NULL)a =headB;
            else a= a->next;
            
            if(b==NULL)b=headA;
            else b= b->next;
        }
        return a;
        */
    }
};