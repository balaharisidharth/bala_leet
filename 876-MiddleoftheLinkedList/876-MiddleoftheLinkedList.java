// Last updated: 09/06/2026, 11:36:52
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
12    public ListNode middleNode(ListNode head) {
13        int a=1;
14        int b=0;
15        ListNode c=head;
16        ListNode temp=head;
17        while(temp.next!=null){
18            a++;
19            temp=temp.next;
20            b=a/2;
21            b++;
22        }
23        for(int i=0;i<b-1;i++){
24            c=c.next;
25        }
26        // System.out.println(a);
27        // System.out.println(b);
28    return c;
29    }
30}