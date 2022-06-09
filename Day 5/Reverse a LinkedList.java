class Solution {
    public ListNode reverseList(ListNode head) {
        if ( head == null )
            return head;
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = head.next;
        
        while( curr != null ) {
            curr.next = pre;
            pre = curr;
            curr = next;
            if (next != null) {
               next = next.next;
            }
        }
        return pre;
    }
}