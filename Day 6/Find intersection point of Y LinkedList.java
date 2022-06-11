public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lA = length(headA);
        int lB = length(headB);
        
        int diff = Math.abs(lA-lB);
        
        if (lA>lB)
            for(int i = 0; i < diff ; i++) 
                headA = headA.next;
         
        else
            for(int i = 0; i < diff ; i++) 
                headB = headB.next;
        
        while ( headA != null && headB != null ) {
            if ( headA == headB ) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
            
        }
        return null;
    }
    public int length(ListNode head) {
        
        ListNode f = head;
        int l=0;
        
        while ( f != null ) {
            l++;
            f = f.next;
        }
        return l;
    }
}