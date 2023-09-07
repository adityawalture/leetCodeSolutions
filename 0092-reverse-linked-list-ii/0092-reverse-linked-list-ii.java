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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        ListNode currentNode = head;
        
        while(left > 1){
            prev = currentNode;
            currentNode = currentNode.next;
            left --;
            right --;
        }
        
        ListNode connect = prev;
        ListNode tail = currentNode;
        
        while(right > 0){
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
            right --;
            
        }
        
        if(connect != null){
            connect.next = prev;
        }else{
            head = prev;
        }
        
        tail.next = currentNode;
        return head;
    }
}