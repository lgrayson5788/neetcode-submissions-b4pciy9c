/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        
        Map<ListNode, Integer> map = new HashMap();
        int index = 0, finalIndex = -1;

        while(head != null){
            if(map.containsKey(head)){
                finalIndex = map.get(head);
                return true;
            }
            map.put(head, index);
            head = head.next;
            index++;
        }

        return false;
        
    }
}
