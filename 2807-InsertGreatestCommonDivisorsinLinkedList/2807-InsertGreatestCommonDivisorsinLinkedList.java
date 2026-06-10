// Last updated: 10/06/2026, 09:53:57
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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13        int a=0;
14        int b=0;
15        int gcd;
16        ListNode temp1=head;
17        ListNode temp2=head.next;
18        while(temp1!=null && temp2!=null){
19            a=temp1.val;
20            b=temp2.val;
21            int min=Math.min(a,b);
22            gcd=1;
23            for(int i=min;i>0;i--){
24                if(a%i==0 && b%i==0){
25                    gcd=i;
26                    break;
27                }
28            }
29            ListNode new_node=new ListNode(gcd);
30            temp1.next=new_node;
31            new_node.next=temp2;
32            temp1=temp2;
33            temp2=temp2.next;               
34
35            
36        }
37        return head;
38    }
39}