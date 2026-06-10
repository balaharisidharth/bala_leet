// Last updated: 10/06/2026, 12:27:56
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
16/**
17 * Definition for a binary tree node.
18 * public class TreeNode {
19 *     int val;
20 *     TreeNode left;
21 *     TreeNode right;
22 *     TreeNode() {}
23 *     TreeNode(int val) { this.val = val; }
24 *     TreeNode(int val, TreeNode left, TreeNode right) {
25 *         this.val = val;
26 *         this.left = left;
27 *         this.right = right;
28 *     }
29 * }
30 */
31class Solution {
32    public List<Integer> inorderTraversal(TreeNode root) {
33        List<Integer> ans = new ArrayList<>();
34        helper(root, ans);
35        return ans;
36    }
37
38    private void helper(TreeNode root, List<Integer> ans) {
39        if (root != null){
40            helper(root.left, ans);
41            ans.add(root.val);
42            helper(root.right, ans);
43        }
44    }
45}