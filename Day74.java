class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode previos = dummy;
        
        while (previos.next != null && previos.next.next != null) {
            
            ListNode first = previos.next;
            ListNode second = previos.next.next;
            
            
            first.next = second.next;
            second.next = first;
            previos.next = second;
            
            previos = first;
        }
        
        return dummy.next;
    }
}
