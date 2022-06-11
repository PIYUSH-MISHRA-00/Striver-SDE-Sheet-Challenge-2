public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // Step 1: If list is null
        if(head == null){
            return head;
        }
        
        // Step 2: Take 2 pointers
        ListNode slow = head;
        ListNode fast = head;
        
        // Step 3: Start moving the pointers until they reach null or meets at a point
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                break;
            }
            
        }
        
        // Step 4: Check if no loop is there
        if(fast == null || fast.next == null){
            return null;
        }
        
        // Step 5: Move slow pointer to the start of list
        slow = head;
        
        // Step 6: Start moving them until they meet
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
    }
}