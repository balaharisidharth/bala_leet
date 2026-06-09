// Last updated: 09/06/2026, 15:39:56
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
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode node = null;
14
15        ListNode temp = head;
16        while (temp != null) {
17        ListNode t= temp.next;
18            temp.next = node;
19            node = head;
20            node = temp;
21            temp=t;
22        }
23
24        return node;        
25    }
26}