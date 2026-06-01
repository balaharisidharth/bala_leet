// Last updated: 01/06/2026, 06:40:02
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11public class Solution {
12    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
13        ListNode head = new ListNode(0);
14        ListNode handler = head;
15        while(l1 != null && l2 != null) {
16            if (l1.val <= l2.val) {
17                handler.next = l1;
18                l1 = l1.next;
19            } else {
20                handler.next = l2;
21                l2 = l2.next;
22            }
23            handler = handler.next;
24        }
25        
26        if (l1 != null) {
27            handler.next = l1;
28        } else if (l2 != null) {
29            handler.next = l2;
30        }
31        
32        return head.next;
33    }
34}