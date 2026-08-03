// Last updated: 03/08/2026, 09:05:50
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) return head;
14
15        int len = 1;
16        ListNode tail = head;
17
18        while (tail.next != null) {
19            len++;
20            tail = tail.next;
21        }
22
23        k = k % len;
24
25        if (k == 0) return head;
26
27        tail.next = head;
28
29        ListNode newLastNode = findKthNode(head, len - k);
30
31        head = newLastNode.next;
32        newLastNode.next = null;
33
34        return head;
35    }
36
37    public ListNode findKthNode(ListNode temp, int k) {
38        k--;
39
40        while (temp != null && k > 0) {
41            temp = temp.next;
42            k--;
43        }
44
45        return temp;
46    }
47}