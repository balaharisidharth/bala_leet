// Last updated: 27/06/2026, 09:28:55
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
12    ListNode head,tail;
13    public ListNode reverseKGroup(ListNode givenHead, int k){
14        Stack<ListNode> stk = new Stack<>();
15        ListNode node = givenHead;
16        head = tail = null;
17        while(node != null){
18            stk.push(node);
19            node = node.next;
20            if(stk.size() == k){
21                insert(stk);
22                tail.next = node;
23            }
24        }
25       
26        return head;
27        
28    }
29    private void insert(Stack<ListNode> stk){
30        while(!stk.isEmpty()){
31            ListNode node = stk.pop();
32            node.next = null;
33            if(head == null){
34                tail = head = node;
35            }
36            else{
37                tail.next = node;
38                tail = node;
39            }
40        }
41    }
42
43}