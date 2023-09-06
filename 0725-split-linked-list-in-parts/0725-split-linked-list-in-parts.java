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
    public int length(ListNode root){
        int n = 0;
        while(root != null){
            n++;
            root = root.next;
        }
        return n;
    }
    
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = length(head);
        int subLength = n/k;
        int extraNode = n%k;
        
        ListNode[] ans = new ListNode[k];
        int indx = 0;
        for(int i=0; i < k; i++){
            ans[indx ++] = head;
            for(int j=0; j < subLength + (extraNode > 0 ? 1:0) - 1; j++){
                if(head == null) break;
                head = head.next;
            }
            if(head != null){
                ListNode temp = head.next;
                head.next = null;
                head = temp;
            }
            extraNode -= 1;
        }
        return ans;
    }
}