// Last updated: 09/06/2026, 16:27:06
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
11
12class Solution {
13    public boolean isPalindrome(ListNode head) {
14        ListNode slow = head, fast = head, prev, temp;
15        while (fast != null && fast.next != null) {
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        prev = slow;
20        slow = slow.next;
21        prev.next = null;
22        while (slow != null) {
23            temp = slow.next;
24            slow.next = prev;
25            prev = slow;
26            slow = temp;
27        }
28        fast = head;
29        slow = prev;
30        while (slow != null) {
31            if (fast.val != slow.val) return false;
32            fast = fast.next;
33            slow = slow.next;
34        }
35        return true;
36    }
37}
38
39