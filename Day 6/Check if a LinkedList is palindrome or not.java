class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        
        while ( f!=null && f.next!=null ) {
            s=s.next;
            f=f.next.next;
        }
        if ( f != null ) 
            s = s.next;
        
        ListNode temp = head;
        ListNode end = s;
        
        s = reverse(s);
        
        while ( s != null )  {
            if(temp.val!=s.val)
                return false;
            temp = temp.next;
            s = s.next;
        }
        return true;
    }
        public ListNode reverse(ListNode head) {
            if(head == null || head.next == null )
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