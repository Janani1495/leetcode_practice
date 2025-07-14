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
    public int getDecimalValue(ListNode head) {
        String s="";int num=0;
        while(head!=null){
            s+=head.val;
            head=head.next;
        }System.out.print(s);
       int n=Integer.parseInt(s,2);
       return n;
    }
}