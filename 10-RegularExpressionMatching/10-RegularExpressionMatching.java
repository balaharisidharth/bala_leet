// Last updated: 27/06/2026, 09:28:25
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
12    public ListNode mergeKLists(ListNode[] lists) {
13     
14        //coz node is not comparable in java unlike Integer is we used custom comparator
15       PriorityQueue<ListNode> pq = new  PriorityQueue<>((a,b)-> Integer.compare(a.val,b.val));
16
17        //get all the node and add it in pq
18       for(ListNode node : lists){
19         if(node != null){
20            pq.offer(node);
21         }
22       }
23
24       ListNode dummy = new ListNode(0);
25       ListNode temp = dummy;
26       
27       //we are using minHeap so it will give me smallest node on pop
28       while(!pq.isEmpty()){
29            ListNode smallest = pq.poll(); //get the smallest
30            temp.next = smallest; //adding in ans node
31            temp = temp.next; //move pointer for adding next smaller node
32
33            //also check if next node occurs in that specific list or not from where we are extracting
34            if(smallest.next != null) pq.offer(smallest.next);
35       }
36    return dummy.next;
37
38    }
39}