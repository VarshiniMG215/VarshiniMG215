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
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;

        ListNode evenhead=new ListNode(0);
        ListNode eventail = evenhead;

        ListNode oddhead = new ListNode(0);
        ListNode oddtail = oddhead;
        int position = 1;
        while(current!=null){

            if(position %2==0){
                eventail.next = current;
                eventail = eventail.next;
            }else{
                oddtail.next = current;
                oddtail = oddtail.next;
            }
            position++;
            current = current.next;
        }
        eventail.next = null;
        oddtail.next = evenhead.next;


        return oddhead.next;
    }
}