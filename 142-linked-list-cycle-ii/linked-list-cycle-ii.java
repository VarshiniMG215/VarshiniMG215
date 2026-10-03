public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;

        while (current != null) {

            if (set.contains(current)) {
                return current;
            }

            set.add(current);
            current = current.next;
        }

        return null;
    }
}