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
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) {
    return;
}
        ListNode slow = head;
        ListNode fast = head.next;
        // ListNode beforemiddle =head;

        while(fast!=null && fast.next!= null){
            //  beforemiddle = slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        // beforemiddle.next = null;
      ListNode curr = slow.next;
       
        slow.next = null;
 ListNode prev = null;

        while(curr!=null){
            // beforemiddle.next = null;
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr ;
            curr = next;
        }
        // beforemiddle = curr.next;

        ListNode first = head;
ListNode second = prev;

while (  second != null) {

    ListNode firstNext = first.next;
    ListNode secondNext = second.next;

    first.next = second;
    second.next = firstNext;

    first = firstNext;
    second = secondNext;
}

// return 
    }
}