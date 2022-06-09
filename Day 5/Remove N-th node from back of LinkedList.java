class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = head;
        
        while (fast != null) {
            if(n==0) slow = slow.next;
            else n--;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;   
    }
}