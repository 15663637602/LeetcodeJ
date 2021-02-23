package easy.ReverseLinkList206;


public class ReverseLinkListN {
    ListNode successor = null;
    public ListNode reverseList(ListNode head, int n) {
        if (head == null)
            return null;
        if (n < 1) {
            return head;
        }
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseList(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
