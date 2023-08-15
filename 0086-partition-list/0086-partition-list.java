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
    public ListNode partition(ListNode head, int x) {
        ListNode lessThenX = new ListNode(0);
        ListNode greaterThenX = new ListNode(0);
        
        ListNode lessThenXhead = lessThenX, greaterThenXhead = greaterThenX;
        
        while(head != null){
            if(head.val < x){
                lessThenXhead.next = head;
                lessThenXhead = lessThenXhead.next;
            }else{
                greaterThenXhead.next = head;
                greaterThenXhead = greaterThenXhead.next;
            }
            head = head.next;
        }
        
        greaterThenXhead.next = null;
        lessThenXhead.next = greaterThenX.next;
        
        return lessThenX.next;
    }
}