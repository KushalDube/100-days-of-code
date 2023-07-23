/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // System.out.print(headA.val);
        ListNode iniB=headB;
        // if(headA==null || headB==null){
        //     return 
        // }
        while(headA!=null){
            if(headB==null){
                headA=headA.next;
                headB=iniB;
            }
            if(headA==headB){
                return headA;
            }
            headB=headB.next;
        }

        return headA;
    }
}