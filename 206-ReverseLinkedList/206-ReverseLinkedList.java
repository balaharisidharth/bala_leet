// Last updated: 09/06/2026, 15:23:37
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
15        while (head != null) {
16            ListNode temp = head.next;
17            head.next = node;
18            node = head;
19            head = temp;
20        }
21
22        return node;        
23    }
24}