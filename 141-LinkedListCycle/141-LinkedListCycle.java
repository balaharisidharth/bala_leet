// Last updated: 09/06/2026, 12:23:58
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
13    public ListNode detectCycle(ListNode head) {
14        ListNode a=head;
15        ListNode b=head;
16        while(a!=null && a.next!=null){
17            a=a.next.next;
18            b=b.next;
19            if(a==b){
20                while(head!=a){
21                    head=head.next;
22                    a=a.next;
23                }
24                return a;
25            }
26        }
27        return null;
28    }
29    }