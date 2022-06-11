class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
                
        ListNode preOfGroupHead = dummy;
        ListNode groupHead = head; // the head node in this group
        ListNode groupNode = head; // the node that is used for traversal in this group
        ListNode groupTail = head; // the tail node in this group

        while(true){
            int count = 1;
            while(count <= k && groupNode != null){ // if a group of K nodes have been traversed
                groupTail = groupNode;
                groupNode = groupNode.next;
                count ++;
            }
                        
            if(count <= k){ // a group has less then k nodes, aka the last group
                break;
            }
            
            // now, groupTail is the tail of current group
            // groupNode is the head of next group
            
            // preOfGroupHead -> (groupHead -> ... -> groupTail) -> groupNode
            reverseK(groupHead, k);
            
            // preOfGroupHead ? groupTail -> ... -> groupHead ? groupNode
            
            preOfGroupHead.next = groupTail;
            groupHead.next = groupNode;
            
            // preOfGroupHead -> groupTail -> ... -> groupHead -> groupNode
            preOfGroupHead = groupHead;
            groupHead = groupNode;
        }
        
        return dummy.next;
    }
    
    /**
     * Reverse k linked nodes from head 
     * this method returns nothing, because we've got left node and right node of the reversed part
     * @param head
     * @param k
     */
    private void reverseK(ListNode head, int k){
        ListNode prev = null;
        ListNode curr = head;
        while(k > 0){
            ListNode tmpNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmpNext;
            k --;
        }
    }
}