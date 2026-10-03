class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {

            if (set.contains(current.val)) {
                prev.next = current.next;
                current = current.next;
            } 
            else {
                set.add(current.val);
                prev = current;
                current = current.next;
            }
        }

        return head;
    }
}