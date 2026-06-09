// Last updated: 09/06/2026, 11:50:59
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode a=head;
15        ListNode b=head;
16        while(a!=null && a.next!=null){
17            a=a.next.next;
18            b=b.next;
19            if(a==b) return true;
20        }
21        return false;
22    }
23}