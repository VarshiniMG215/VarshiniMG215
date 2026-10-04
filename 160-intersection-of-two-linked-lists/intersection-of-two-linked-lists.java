public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = headA;

        while (current != null) {
            set.add(current);
            current = current.next;
        }

        ListNode current2 = headB;

        while (current2 != null) {

            if (set.contains(current2)) {
                return current2;
            }

            current2 = current2.next;
        }

        return null;
    }
}