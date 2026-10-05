class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // while()
            //    k = k % n;
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode current = head;
         int n=0;
         while(current!=null){
            current = current.next;
             n = n+1;
         }
          k = k % n;
        for (int i = 0; i < k; i++) {

            ListNode prev = null;
             current = head;

            // Find the last node
            while (current.next != null) {
                prev = current;
                current = current.next;
            }

            // Move last node to the front
            current.next = head;

            // Break the old connection
            prev.next = null;

            // Update head
            head = current;
        }

        return head;
    }
}