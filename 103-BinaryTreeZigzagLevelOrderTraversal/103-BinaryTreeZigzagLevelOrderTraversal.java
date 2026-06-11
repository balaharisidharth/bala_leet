// Last updated: 11/06/2026, 14:54:40
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        List<Integer> ans = new ArrayList<>();
20        if (root == null) {
21            return ans;
22        }
23        q.add(root);
24
25        while (!q.isEmpty()) {
26            int s = q.size();
27            List<Integer> temp = new ArrayList<>();
28            for (int i = 0; i < s; i++) {
29                if (q.peek().left != null) {
30                    q.add(q.peek().left);
31                }
32                if(q.peek().right!=null){
33                    q.add(q.peek().right);
34                }
35                temp.add(q.remove().val);
36            }
37            ans.add(temp.get((temp.size())-1));
38        }
39        return ans;
40    }
41}