/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
+ *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
       if(head==null ){
        return head;
       } 

        ListNode current = head;

      ListNode smallhead = new ListNode(0);
ListNode smalltail = smallhead;

ListNode largehead = new ListNode(0);
ListNode largetail = largehead;

        while(current!=null){

                 if(current.val<x){
                    smalltail.next = current;
smalltail = smalltail.next;
                     
                 }else{
                        largetail.next = current;
largetail = largetail.next;

                 }
                 current = current.next;
        }
        largetail.next = null;
        smalltail.next = largehead.next;


        // smallhead.next = largehead;

        return smallhead.next;

      
    }
}