// Last updated: 09/06/2026, 14:59:00
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListN ode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode ans=new ListNode(-1);
14        ListNode temp=ans;
15        while(list1!=null && list2!=null){
16            if(list1.val<list2.val){
17                temp.next=new ListNode(list1.val);
18                temp=temp.next;
19                list1=list1.next;
20            }
21            else{
22                temp.next=new ListNode(list2.val);
23                temp=temp.next;
24                list2=list2.next;
25            }
26        }
27        if(list1 != null) temp.next=list1;
28        if(list2 != null) temp.next=list2;
29        return ans.next;
30    }
31}