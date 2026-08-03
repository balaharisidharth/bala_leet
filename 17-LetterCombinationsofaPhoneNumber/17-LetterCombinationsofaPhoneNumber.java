// Last updated: 03/08/2026, 08:54:24
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode swapPairs(ListNode head) {
17
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20
21        ListNode prev = dummy;
22
23        while (prev.next != null && prev.next.next != null) {
24
25            ListNode first = prev.next;
26            ListNode second = first.next;
27
28            first.next = second.next;
29            second.next = first;
30            prev.next = second;
31
32            prev = first;
33        }
34
35        return dummy.next;
36    }
37}